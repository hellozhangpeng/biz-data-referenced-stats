package tech.realopen.biz.data.referenced.stats.accessor;

/**
 * @author ZhangPeng
 */
public interface DataReferencedStatsAccessor<K> {
  Integer load(K key);

  void store(K key, Integer value);
}
