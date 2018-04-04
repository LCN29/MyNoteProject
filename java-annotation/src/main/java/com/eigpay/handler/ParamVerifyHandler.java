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

    /**
     * 属性验证方法
     * @param clazz 需要验证的bean对象
     * @return 验证结果
     * @throws IllegalAccessException
     */
    public static Result paramVerify(Object clazz) throws IllegalAccessException {
        // 创建响应对象
        Result result = new Result();

        // 获取需要验证bean上面的所有属性
        Field[] fields = clazz.getClass().getDeclaredFields();
        // 遍历所有的属性，一一对其进行验证
        for ( Field field : fields ) {
            //暴力读取，这样才能读取到私用属性的字
            field.setAccessible(true);
            //获取对应属性上面的值
            Object value = field.get(clazz);

            result = verifyStart(field, value, result);
            if (!result.getValid()) {
                break;
            }
        }
        return result;
    }

    /**
     * 对bean上面的属性进行验证
     * @param field 需要验证的属性
     * @param value 属性上面的值
     * @param result 返回的结果对象
     * @return
     */
    private static Result verifyStart(Field field, Object value, Result result){

        // 获取这个属性上面的ParamVerifyAnno注解
        ParamVerifyAnno anno = field.getAnnotation(ParamVerifyAnno.class);
        // 没有这个注解，直接返回
        if(anno == null) {
            result.setHint("bean的属性没有注解，不需要验证");
            result.setValid(true);
            return result;
        }

        String val = value.toString();
        //这个属性没有值，直接返回
        if(val == null) {
            result.setHint("bean的"+field.getName()+"没有值,不需要验证");
            result.setValid(true);
            return result;
        }

        // 获取属性上面的值和注解上面的值进行比较
        if(anno.maxLength()< val.length() ) {
            result.setHint("bean的"+field.getName()+"超过最大长度了");
            result.setValid(false);
            return result;
        }

        return result;
    }

    /** 这个类主要用于提示判断作用，
     * valid用于属性验证过程中出现不合法的情况可以中断，不需要继续验证其他的属性
     * hint 用于给调用验证器的一方，既调用方提示作用
     */
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
