package himedia.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	@Before("execution(public ProductVo himedia.aoptest.ProductService.findProduct(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("call [defore dadvice]");
		System.out.println("메서드 실행 전:" + joinPoint.getSignature().getName());
		
		Object[] args = joinPoint.getArgs();			// 메서드로 전달된 데이터 객체
		if (args != null && args.length > 0) {
			System.out.println("전달된 인자:" + args[0]);
			System.out.println("-------------------------------");
		}
	}
	
	@After("execution(* himedia.aoptest.*.findProduct(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("call [after advice]");
		System.out.println("메서드 실행 후:" + joinPoint.getSignature().getName());
		System.out.println("-------------------------------");
	}
	
	@AfterReturning("execution(* *..ProductService.findProduct(..))")
	public void afterReturning(ProductVo vo 	// findProduct 메서드가 반환하는 리턴 객체 
			) {
		// 메서드 실행 후 결과가 반환된 후 실행되는 Advice
		System.out.println("call [afterReturning advice]");
		System.out.println("메서드가 리턴한 객체:" + vo);
	}

}
