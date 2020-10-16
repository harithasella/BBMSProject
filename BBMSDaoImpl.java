package com.main.dao;

import java.util.List;


import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.DonorModel;
import com.main.model.RequesterModel;
import com.main.model.UserModel;

/**
 * Dao class
 * @author seella.haritha
 *
 */
@Repository
public class BBMSDaoImpl implements BBMSDao {
	private static Logger log = Logger.getLogger(BBMSDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUserDetails(UserModel user) {
		log.info("inside userDetails method");
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);

	}

	@Override
	public void saveRequesterDetails(RequesterModel requester) {
		// TODO Auto-generated method stub
		log.info("inside saveRequesterDetails method");
		sessionFactory.getCurrentSession().save(requester);
	}

	@Override
	public void saveDonorDetails(DonorModel donor) {
		// TODO Auto-generated method stub
		log.info("inside saveDonorDetails method");

		sessionFactory.getCurrentSession().save(donor);
	}

	@Override
	public List<RequesterModel> fetchRequest() {
		// TODO Auto-generated method stub
		log.info("inside fetchRequest method");
		Query query = sessionFactory.getCurrentSession().createQuery("from RequesterModel m");
		List<RequesterModel> requestList = query.list();
		return requestList;
	}

	@Override
	public List<DonorModel> fetchDonor() {
		log.info("inside fetchDonor method");
		Query query = sessionFactory.getCurrentSession().createQuery("from DonorModel d");
		List<DonorModel> donorList = query.list();
		return donorList;
	}

	@Override
	public List<UserModel> fetchRegister() {
		log.info("inside fetchRegister method");
		Query query = sessionFactory.getCurrentSession().createQuery("from UserModel u");
		List<UserModel> userList = query.list();
		return userList;
	}

	@Override
	public RequesterModel fetchReqById(Integer rid) {
		log.info("inside  dao fetchReqById method");
		RequesterModel request = (RequesterModel) sessionFactory.getCurrentSession().get(RequesterModel.class, rid);
		return request;
	}

	@Override
	public void updateRequest(RequesterModel request) {
		// TODO Auto-generated method stub
		log.info("inside  dao updateRequest method");
		sessionFactory.getCurrentSession().update(request);

	}

	@Override
	public DonorModel fetchRequestById(Integer pId) {
		log.info("inside  dao fetchRequestById method");
		DonorModel donor = (DonorModel) sessionFactory.getCurrentSession().get(DonorModel.class, pId);
		return donor;
	}

	@Override
	public void updateDonor(DonorModel donor) {
		// TODO Auto-generated method stub
		log.info("inside  dao updateDonor method");
		sessionFactory.getCurrentSession().update(donor);

	}

}
