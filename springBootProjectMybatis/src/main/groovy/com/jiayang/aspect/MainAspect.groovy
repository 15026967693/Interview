package com.jiayang.aspect
import org.aopalliance.intercept.Joinpoint
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.AfterThrowing
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component
@Component
@Aspect
class MainAspect {
	@Pointcut("execution(* com.jiayang.serviceImpl..*(..))")
def mainPointcut() {}
@Before("mainPointcut()")
def before(JoinPoint joinPoint) {
	println "beforeAop"
	println "args:${joinPoint.getArgs()}"
	println joinPoint.getArgs()
}
@Around("mainPointcut()")
def  around(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable{
	println "do before aop"
	def result=proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
	println "do after aop"
	result
}

@AfterReturning("mainPointcut()")
def afterReturning(JoinPoint joinPoint) {
	println "after returning aop"
}

@AfterThrowing(value="mainPointcut()", throwing="ex")
def afterThrowing(JoinPoint joinPoint,Throwable ex) {
	println "AfterThrowing Aop"
}

@After("mainPointcut()")
public void after(JoinPoint joinPoint) {
	println "after Aop"
	println "args:${joinPoint.getArgs()}"
}
}

