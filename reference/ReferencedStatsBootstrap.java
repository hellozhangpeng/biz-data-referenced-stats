package com.example.demo.reference;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/** @author ZhangPeng */
public class ReferencedStatsBootstrap {
  private final List<DataReferencedStatsHandler> handlers = new LinkedList<>();

  private boolean async = false;

  public ReferencedStatsBootstrap() {}

  public ReferencedStatsBootstrap(boolean async) {
    this.async = async;
  }

  public ReferencedStatsBootstrap async(boolean async) {
    this.async = async;
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


    CompletableFuture.runAsync();
  }

  protected void executeSync(DataReferencedStatsContext dataReferencedStatsContext) {
    for (DataReferencedStatsHandler handler : this.handlers) {
      handler.handle(dataReferencedStatsContext);
    }
  }
}
