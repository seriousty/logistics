package org.module.client.businesslogicservice.statisticBLservice_Driver;

import org.module.client.businesslogicservice.statisticBLservice.InitAccountBLService;


public class InitAccountBLService_Driver {
	public void drive(InitAccountBLService initAccountBLService){
		if(initAccountBLService.init())
			System.out.println("init successfully!");
	}
}
