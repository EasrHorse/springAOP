package aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class LogException implements ThrowsAdvice {
    void afterThrowing(Object o, Method method, Object[] objects,NullPointerException ex){
        System.out.println("异常通知：目标对象"+o+"调用方法名"+method.getName()+"方法参数个数"+objects.length+"异常类"+ex.getMessage());
    }

}
