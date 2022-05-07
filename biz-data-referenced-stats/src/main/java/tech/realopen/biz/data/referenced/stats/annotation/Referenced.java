package tech.realopen.biz.data.referenced.stats.annotation;

import tech.realopen.biz.data.referenced.stats.handler.ReferencedStatsHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** @author ZhangPeng */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Referenced {
  Class<? extends ReferencedStatsHandler> handlerClass();
}
