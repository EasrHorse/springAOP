package aop;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {
//后置通知
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知：目标对象"+o1+"调用方法名"+method.getName()+"方法参数个数"+objects.length+"方法返回值"+o);
    }
}
