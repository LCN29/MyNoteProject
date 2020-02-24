package com.lcn.three.practical;


import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-26 下午 05:27
 */
public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("调用main方法------------------------------------------------");
        Class clazz = Class.forName("com.lcn.three.practical.One");
        Method m = clazz.getMethod("main", String[].class);
        //JDk5之后，第二个参数为可变长度的参数
        // 因为main方法为静态方法，所以第一个参数可以为null
        // m.invoke(null, new Object[]{new String[]{"a","b","c"}});//方式二
        m.invoke(null, (Object)new String[]{"a","b","c"});  // 方式一

        System.out.println("通过配置文件运行方法-------------------------------------");
        Class stuClass = Class.forName(getValue("reflect.className"));
        Method method = stuClass.getMethod(getValue("reflect.methodName"));
        method.invoke(stuClass.getConstructor().newInstance());
        // 当系统升级时，不需要Student类了，需要Teacher,只需要修改配置文件

        System.out.println("通过反射越过泛型检查------------------------------->");
        // 泛型用在编译期，编译过后泛型擦除（消失掉）通过反射越过泛型检查的
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Class listClass = list.getClass();
        Method m2 = listClass.getMethod("add", Object.class);
        //添加了整形
        m2.invoke(list, 100);
        for(Object obj : list) {
            System.out.println(obj);
        }
    }

    public static String getValue(String key) {
        try{
            InputStream in = Main.class.getClassLoader().getResourceAsStream("service.properties");
            Properties pro = new Properties();
            pro.load(in);
            in.close();
            return pro.getProperty(key);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
