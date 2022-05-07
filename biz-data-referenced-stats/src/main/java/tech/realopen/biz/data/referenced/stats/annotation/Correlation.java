package tech.realopen.biz.data.referenced.stats.annotation;

import tech.realopen.biz.data.referenced.stats.reference.DataReferencedStatsHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** @author ZhangPeng */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Correlation {
  Class sourceType();

  Class<? extends DataReferencedStatsHandler> handlerClass() default
      DataReferencedStatsHandler.class;
}
