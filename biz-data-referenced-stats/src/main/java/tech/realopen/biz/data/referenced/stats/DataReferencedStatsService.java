package tech.realopen.biz.data.referenced.stats;

/**
 * @author ZhangPeng
 */
public interface DataReferencedStatsService<T, K> {

  int get(T type, K key);

  boolean isReferenced(T type, K key);

  void add(T type, K key);

  void add(T type, K key, int value);
}
