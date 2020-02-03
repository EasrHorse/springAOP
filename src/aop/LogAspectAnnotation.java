package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Aspect
@Component("annotation1")
public class LogAspectAnnotation  {
@Before("execution(public void service.IStudentServiceImpl.*(*))")//前置通知
    public void myBefore(JoinPoint joinPoint){
        System.out.println("注解前置通知");
    System.out.println("注解前置通知：对象"+joinPoint.getTarget()+"，方法名"+joinPoint.getSignature().getName()
            +"，方法入参"+ Arrays.toString(joinPoint.getArgs()));
    }
    //后置通知  target
@AfterReturning(pointcut = "execution(public void service.IStudentServiceImpl.*(*))",
        returning = "returnValue")
public void myAfter(JoinPoint joinPoint,Object returnValue){
    System.out.println("注解-后置通知");
    System.out.println("注解后置通知：对象"+joinPoint.getTarget()+"，方法名"+joinPoint.getSignature().getName()
            +"，方法返回值"+ returnValue);
}

@Around("execution(public void service.IStudentServiceImpl.*(*))")
 public void myAround(ProceedingJoinPoint pjp) throws Throwable {
//前置
    System.out.println("前---注解环绕");
    try {
        Object object=pjp.proceed(); //拦截点
        //后置
        System.out.println("后--注解环绕");
    } catch (Throwable throwable) {
        System.out.println("异常--注解环绕");
        throwable.printStackTrace();
    }
    finally {
        //最终通知  @After
        System.out.println("注解--环绕--最终通知");
    }
}
}
