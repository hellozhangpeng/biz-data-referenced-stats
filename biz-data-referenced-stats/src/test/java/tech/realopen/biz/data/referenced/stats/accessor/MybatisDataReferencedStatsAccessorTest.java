package tech.realopen.biz.data.referenced.stats.accessor;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ZhangPeng
 */
class MybatisDataReferencedStatsAccessorTest {
  private String type = "user";
  private String key = "1";

  @Test
  void load() {}

  @Test
  void store() {
    LocalCacheDataReferencedStatsAccessor localCacheDataReferencedStatsAccessor =
        new LocalCacheDataReferencedStatsAccessor();

    localCacheDataReferencedStatsAccessor.store(key, 1);

    MybatisDataReferencedStatsAccessor mybatisDataReferencedStatsAccessor = new MybatisDataReferencedStatsAccessor();
    mybatisDataReferencedStatsAccessor.store(key, 1);
  }
}
