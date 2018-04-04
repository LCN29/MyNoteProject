package com.eigpay.exception;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-03 下午 03:31
 */
public class VerifyFailedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 异常code
     */
    private String errorCode;

    /**
     * 异常提示信息
     */
    private String errorMsg;

    public VerifyFailedException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public VerifyFailedException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
