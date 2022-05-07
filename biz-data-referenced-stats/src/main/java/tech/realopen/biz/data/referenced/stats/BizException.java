package tech.realopen.biz.data.referenced.stats;

/**
 * @author ZhangPeng
 */
public class BizException extends RuntimeException {
  public static final int BIZ_EXCEPTION = 1;
  private static final long serialVersionUID = 7815426658514648734L;

  private int code;

  public BizException() {
    super();
  }

  public BizException(String message, Throwable cause) {
    super(message, cause);
  }

  public BizException(String message) {
    super(message);
  }

  public BizException(Throwable cause) {
    super(cause);
  }

  public BizException(int code) {
    super();
    this.code = code;
  }

  public BizException(int code, String message, Throwable cause) {
    super(message, cause);
    this.code = code;
  }

  public BizException(int code, String message) {
    super(message);
    this.code = code;
  }

  public BizException(int code, Throwable cause) {
    super(cause);
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
}
