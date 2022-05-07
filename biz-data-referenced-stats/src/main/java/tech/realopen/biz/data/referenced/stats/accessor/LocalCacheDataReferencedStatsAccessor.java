package tech.realopen.biz.data.referenced.stats.accessor;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ZhangPeng
 */
public class LocalCacheDataReferencedStatsAccessor<K> implements DataReferencedStatsAccessor<K> {
  private ConcurrentHashMap<K, Integer> cacheMap;

  public LocalCacheDataReferencedStatsAccessor() {
    this(1024);
  }

  public LocalCacheDataReferencedStatsAccessor(int length) {
    this.cacheMap = new ConcurrentHashMap<>(length);
  }

  @Override
  public Integer load(K key) {
    return cacheMap.get(key);
  }

  @Override
  public void store(K key, Integer value) {
    this.cacheMap.put(key, value);
  }
}
