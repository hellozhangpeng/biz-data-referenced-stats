package com.example.demo.reference;

/** @author ZhangPeng */
public class TestReference {
  public void demo() {
    ReferencedStatsBootstrap referencedStatsBootstrap = new ReferencedStatsBootstrap();

    referencedStatsBootstrap
        .addHandler(dataReferencedStatsContext -> {})
        .addHandler(dataReferencedStatsContext -> {})
        .async(true);

    referencedStatsBootstrap.execute(new DataReferencedStatsContext());
  }
}
