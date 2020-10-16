package com.main.service;

import java.util.List;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.BBMSDao;
import com.main.model.DonorModel;
import com.main.model.RequesterModel;
import com.main.model.UserModel;

/**
 * Inside service class
 * @author seella.haritha
 *
 */
@Service
@Transactional

public class BBMSServiceImpl implements BBMSService {
	private static Logger log = Logger.getLogger(BBMSServiceImpl.class);
	@Autowired
	private BBMSDao bbmsDao;

	@Override
	public void saveUserdetails(UserModel user) {
		log.info("inside save UserDetails method");
		// TODO Auto-generated method stub
		bbmsDao.saveUserDetails(user);

	}

	@Override
	public void saveRequesterdetails(RequesterModel requester) {
		log.info("inside saveRequesterDetails method");
		// TODO Auto-generated method stub
		bbmsDao.saveRequesterDetails(requester);

	}

	@Override
	public void saveDonordetails(DonorModel donor) {
		// TODO Auto-generated method stub
		log.info("inside saveDonorDetails method");
		bbmsDao.saveDonorDetails(donor);
	}

	@Override
	public List<RequesterModel> fetchRequest() {
		log.info("inside fetchRequest method");
		// TODO Auto-generated method stub
		List<RequesterModel> requestList = bbmsDao.fetchRequest();
		return requestList;
	}

	@Override
	public List<DonorModel> fetchDonor() {
		log.info("inside fetchDonor method");
		// TODO Auto-generated method stub
		List<DonorModel> donorList = bbmsDao.fetchDonor();
		return donorList;

	}

	@Override
	public List<UserModel> fetchRegister() {

		log.info("inside fetchRegister method");
		// TODO Auto-generated method stub
		List<UserModel> userList = bbmsDao.fetchRegister();
		return userList;

	}

	@Override
	public RequesterModel fetchReqById(Integer rid) {
		log.info("inside fetch requestById method");
		RequesterModel request = bbmsDao.fetchReqById(rid);
		return request;

	}

	@Override
	public void updateRequest(RequesterModel request) {
		log.info("inside update request method");
		bbmsDao.updateRequest(request);

	}

	@Override
	public DonorModel fetchRequestById(Integer pId) {
		log.info("inside fetch requestById method");
		DonorModel donor = bbmsDao.fetchRequestById(pId);
		return donor;
	}

	@Override
	public void updateDonor(DonorModel donor) {

		// TODO Auto-generated method stub
		log.info("inside update donor method");
		bbmsDao.updateDonor(donor);

	}

}
