package com.example.banking.aspect;

import com.example.banking.annotation.TrackExecution;
import com.example.banking.service.BankService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //execution() -> log all service methods
    @Before("execution(* com.example.banking.service.*.*(..))")
    public void logExecution(JoinPoint joinPoint) {
        System.out.println("Executing service method: " + joinPoint.getSignature().getName());
    }

    //within() -> log all classes inside service package
    @Before("within(com.example.banking.service..*)")
    public void logWithin(JoinPoint joinPoint) {
        System.out.println("Method inside service package invoked: " + joinPoint.getSignature().getName());
    }

    //@within() -> log all classes annotated with @Service
    @Before("@within(org.springframework.stereotype.Service)")
    public void logServiceAnnotation(JoinPoint joinPoint) {
        System.out.println("Class annotated with @Service executed: " + joinPoint.getSignature().getName());
    }

    //target() -> log only when target object is BankService
    @Before("target(com.example.banking.service.BankService)")
    public void logTarget(JoinPoint joinPoint) {
        System.out.println("Target object is BankService: " + joinPoint.getSignature().getName());
    }

    //@annotation() -> log methods annotated with @TrackExecution
    @Before("@annotation(com.example.banking.annotation.TrackExecution)")
    public void logAnnotation(JoinPoint joinPoint) {
        System.out.println("Tracked method executed: " + joinPoint.getSignature().getName());
    }
}