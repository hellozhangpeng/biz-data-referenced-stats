package tech.realopen.biz.data.referenced.stats.reference;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

/** @author ZhangPeng */
public class ReferencedStatsBootstrap {
  private final List<DataReferencedStatsHandler> handlers = new LinkedList<>();

  private boolean async = false;

  private Executor executor;

  public ReferencedStatsBootstrap() {}

  public ReferencedStatsBootstrap(boolean async) {
    this.async = async;
  }

  public ReferencedStatsBootstrap async(boolean async) {
    this.async = async;
    return this;
  }

  public ReferencedStatsBootstrap async(boolean async, Executor executor) {
    this.async = async;
    this.executor = executor;
    return this;
  }

  public ReferencedStatsBootstrap addHandler(DataReferencedStatsHandler handler) {
    this.handlers.add(handler);
    return this;
  }

  public void execute(DataReferencedStatsContext dataReferencedStatsContext) {
    if (async) this.executeAsync(dataReferencedStatsContext);
    else this.executeSync(dataReferencedStatsContext);
  }

  protected void executeAsync(DataReferencedStatsContext dataReferencedStatsContext) {
    if (executor == null)
      for (DataReferencedStatsHandler handler : handlers)
        CompletableFuture.runAsync(() -> handler.handle(dataReferencedStatsContext));
    else
      for (DataReferencedStatsHandler handler : handlers)
        CompletableFuture.runAsync(() -> handler.handle(dataReferencedStatsContext), executor);
  }

  protected void executeSync(DataReferencedStatsContext dataReferencedStatsContext) {
    for (DataReferencedStatsHandler handler : this.handlers)
      handler.handle(dataReferencedStatsContext);
  }
}
