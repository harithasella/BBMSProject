package com.main.dao;

import java.util.List;

import com.main.model.DonorModel;
import com.main.model.RequesterModel;
import com.main.model.UserModel;

/**
 * Dao interface
 * @author seella.haritha
 *
 */
public interface BBMSDao {
	public void saveUserDetails(UserModel user);

	public void saveRequesterDetails(RequesterModel requester);

	public void saveDonorDetails(DonorModel donor);

	public List<RequesterModel> fetchRequest();

	public List<DonorModel> fetchDonor();

	public List<UserModel> fetchRegister();

	public RequesterModel fetchReqById(Integer rid);

	public void updateRequest(RequesterModel request);

	public DonorModel fetchRequestById(Integer pId);

	public void updateDonor(DonorModel donor);

}
