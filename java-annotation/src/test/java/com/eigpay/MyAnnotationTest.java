package com.eigpay;

import com.eigpay.annotation.MyAnnotation;
import com.eigpay.handler.AnnotationProcess;
import org.junit.Test;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-03 上午 10:36
 */

@MyAnnotation(count = 6606)
public class MyAnnotationTest {

    @Test
    public void testTeatAnnotation() {
        AnnotationProcess handler = new AnnotationProcess();
        handler.process(MyAnnotationTest.class);
    }

}
