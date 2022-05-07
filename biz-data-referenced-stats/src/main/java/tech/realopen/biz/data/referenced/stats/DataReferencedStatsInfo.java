package tech.realopen.biz.data.referenced.stats;

import lombok.Data;

/**
 * @author ZhangPeng
 */
@Data
public class DataReferencedStatsInfo<T, K> {

  private T type;

  private K key;

  private int referenceNumber;
}
