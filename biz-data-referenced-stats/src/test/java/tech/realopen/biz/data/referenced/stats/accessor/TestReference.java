package tech.realopen.biz.data.referenced.stats.accessor;

import org.junit.jupiter.api.Test;
import tech.realopen.biz.data.referenced.stats.reference.DataReferencedStatsContext;
import tech.realopen.biz.data.referenced.stats.reference.ReferencedStatsBootstrap;

/** @author ZhangPeng */
public class TestReference {

  @Test
  public void demo() {
    ReferencedStatsBootstrap referencedStatsBootstrap = new ReferencedStatsBootstrap();

    referencedStatsBootstrap
        .addHandler(
            dataReferencedStatsContext -> {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("store in redis");
            })
        .addHandler(
            dataReferencedStatsContext -> {
              System.out.println("store in mysql");
            })
        .async(true);

    referencedStatsBootstrap.execute(new DataReferencedStatsContext());
  }
}
