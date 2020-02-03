package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

//环绕通知 本质是个方法
public class LogAround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        try {
            System.out.println("前置通知2");
            Object object=methodInvocation.proceed();
            System.out.println("后置通知2");
            System.out.println("后置通知：目标对象"+methodInvocation.getThis()+"调用方法名"+methodInvocation.getMethod().getName()+
                    "方法参数个数"+methodInvocation.getArguments().length+"方法返回值"+object);
            //getArguments获取参数
        }catch(Exception e){
            System.out.println("异常通知2");
        }

        return null;
    }
}
