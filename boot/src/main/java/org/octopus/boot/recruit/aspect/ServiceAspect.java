package org.octopus.boot.recruit.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
	private static final Logger logger = LoggerFactory.getLogger(ServiceAspect.class);

	@AfterReturning("execution(* org.octopus..*Service.*(..))")
	public void logServiceAccess(JoinPoint joinPoint) {
		logger.info("Completed: " + joinPoint);
	}

}
