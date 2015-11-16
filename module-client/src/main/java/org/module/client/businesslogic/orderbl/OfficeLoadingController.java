package org.module.client.businesslogic.orderbl;

import java.util.ArrayList;

import org.module.client.businesslogic.logisticsbl.Logistics;
import org.module.client.businesslogicservice.logistics.LogisticsService;
import org.module.client.businesslogicservice.order.OfficeLoadingService;
import org.module.client.businesslogicservice.orderBLservice.OfficeLoadingBLService;
import org.module.client.vo.OfficeLoadingListVO;

public class OfficeLoadingController implements OfficeLoadingBLService {
	private OfficeLoadingService officeLoading;
	private LogisticsService logistics;
	public OfficeLoadingController() {
		this.officeLoading = new OfficeLoading();
		this.logistics = new Logistics();
	}

	public OfficeLoadingController(OfficeLoadingService officeLoading,LogisticsService logistics) {
		super();
		this.officeLoading = officeLoading;
		this.logistics = logistics;
	}

	public boolean creat(String loadingDate, String officeId, String trucksId,
			String arrival, String carId, String supervision, String escort,
			String shippingId, String price) {
		
		return this.officeLoading.creat(new OfficeLoadingListVO( loadingDate,  officeId,  trucksId,
			 arrival,  carId,  supervision,  escort,
			 shippingId,  price));
	}

	public ArrayList<OfficeLoadingListVO> getAll() {
		
		return this.officeLoading.getAll();
	}

	public double calculateDriverCost(String origin, String target) {
		return 0;
	}

}