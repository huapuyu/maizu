package com.anders.maizu.service.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anders.maizu.api.rent.RentService;
import com.anders.maizu.dao.AreaDao;
import com.anders.maizu.model.RentHouse;

@Service("rentService")
public class RentServiceImpl implements RentService {
	
	@Autowired
	private AreaDao areaDao;
	
	@Override
	public void createRentHouse(RentHouse house) {
		areaDao.saveNotUpdate(house);
	}

}
