package com.lcn.one.lambda;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 下午 12:00
 */
public class Base {

    private MyLambdaInterface myLambdaInterface;

    /** 内部实现类 */
    private class MyLambdaImpl implements MyLambdaInterface{
        @Override
        public void doSomethings(String str) {
            System.out.println("你想说的事："+ str);
        }
    }

    public void initLambadInterface1(){
        myLambdaInterface = new MyLambdaImpl();
        myLambdaInterface.doSomethings("我应该说什么好呢。11111111");
    }

    public void initLambadInterface2(){
        myLambdaInterface = str -> System.out.println("你想说的事是："+ str);
        myLambdaInterface.doSomethings("我应该说什么好呢。222222");
    }

    public void saySomeWord(MyLambdaInterface myLambda, String str ){
        myLambda.doSomethings(str);
    }

}
