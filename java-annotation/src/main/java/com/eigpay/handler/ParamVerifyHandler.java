package com.eigpay.handler;

import com.eigpay.annotation.ParamVerifyAnno;

import java.lang.reflect.Field;

/**
 * Description: 参数验证注解处理器
 *
 * @Author LCN
 * @Date 2018-04-03 下午 03:27
 */
public class ParamVerifyHandler {

    public static One test() {
       return null;
    }

    public class One{}


    public static Result paramVerify(Object clazz) throws IllegalAccessException {
        Result result = new Result();

        Field[] fields = clazz.getClass().getDeclaredFields();
        for ( Field field : fields ) {
            field.setAccessible(true);
            Object value = field.get(clazz);
            result = verifyStart(field, value, result);
            if (!result.getValid()) {
                break;
            }
        }
        return result;
    }

    private static Result verifyStart(Field field, Object value, Result result){

        ParamVerifyAnno anno = field.getAnnotation(ParamVerifyAnno.class);
        if(anno == null) {
            result.setHint("bean的属性没有注解，不需要验证");
            result.setValid(true);
            return result;
        }

        String val = value.toString();

        if(val == null) {
            result.setHint("bean的"+field.getName()+"没有值,不需要验证");
            result.setValid(true);
            return result;
        }

        if(anno.maxLength()< val.length() ) {
            result.setHint("bean的"+field.getName()+"超过最大长度了");
            result.setValid(false);
            return result;
        }

        return result;
    }

    public static class Result{
        private Boolean valid;
        private String hint;

        public Result(){
            valid = true;
            hint = "验证成功";
        }

        public Boolean getValid() {
            return valid;
        }

        public void setValid(Boolean valid) {
            this.valid = valid;
        }

        public String getHint() {
            return hint;
        }

        public void setHint(String hint) {
            this.hint = hint;
        }
    }

}
