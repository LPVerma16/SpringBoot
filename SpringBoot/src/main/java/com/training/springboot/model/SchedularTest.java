package com.training.springboot.model;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("schedularTest")
@EnableScheduling
public class SchedularTest {
	
	@Scheduled(fixedDelay   =2000 , initialDelay =5000)
	public void fixedDelaySchedular() {
		System.out.println("This Response is From fixed Delay ");
	}
	
	@Scheduled(fixedRateString = "${fixedRate.in.milliseconds}")
	public void fixedRateSchedular() {
		System.out.println("This Response is From fixed Rate ");
	}
	
	@Scheduled(cron ="* 20-30 18 * * *")
	public void cronExpression() {
		System.out.println("This Response is From Cron Expression ");
	}
}
