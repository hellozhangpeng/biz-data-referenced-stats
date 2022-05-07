package tech.realopen.biz.data.referenced.stats.accessor;

import lombok.Data;
import tech.realopen.biz.data.referenced.stats.annotation.Correlation;
import tech.realopen.biz.data.referenced.stats.annotation.ReferencedSource;

/** @author ZhangPeng */
@Data
@ReferencedSource
public class User {
  private int id;

  private String name;

  @Correlation(sourceType = Department.class)
  private int deptId;
}
