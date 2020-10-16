package com.main.service;

import java.util.List;

import com.main.model.DonorModel;
import com.main.model.RequesterModel;
import com.main.model.UserModel;

/**
 * Inside service interface
 * @author seella.haritha
 *
 */
public interface BBMSService {

	public void saveUserdetails(UserModel user);

	public void saveRequesterdetails(RequesterModel requester);

	public void saveDonordetails(DonorModel donor);

	public List<RequesterModel> fetchRequest();

	public List<DonorModel> fetchDonor();

	public List<UserModel> fetchRegister();

	public RequesterModel fetchReqById(Integer rid);

	public void updateRequest(RequesterModel request);

	public DonorModel fetchRequestById(Integer pId);

	public void updateDonor(DonorModel donor);

}
