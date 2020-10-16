package com.main.controller;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.model.AdminModel;
import com.main.model.DonorModel;
import com.main.model.RequesterModel;
import com.main.model.UserModel;
import com.main.service.BBMSService;

/**
 * Controller class
 * 
 * @author seella.haritha
 *
 */
@Controller
public class BBMSController {
	private static Logger log = Logger.getLogger(BBMSController.class);
	@Autowired
	private BBMSService bbmsService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String loadRegistrationForm(ModelMap map) {
		log.info("inside registration form");
		UserModel user = new UserModel();

		map.addAttribute("userForm", user);
		return "UserRegistration";
	}

	@RequestMapping(value = "/saveForm", method = RequestMethod.POST)
	public String saveUser(@Validated @ModelAttribute("userForm") UserModel user, BindingResult result, ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("Validation errors occured");
			viewPage = "UserRegistration";
		} else {
			log.info("invoking saveUserDetails method");
			Random r = new Random();
			int userid = r.nextInt(99999) + 10000;
			user.setId(userid);
			bbmsService.saveUserdetails(user);

			viewPage = "success";
		}
		return viewPage;
	}

	@RequestMapping(value = "/request", method = RequestMethod.GET)
	public String saveRequesterData(ModelMap map) {
		log.info("inside requester data");
		RequesterModel requester = new RequesterModel();
		map.addAttribute("reqForm", requester);
		return "RequesterRegister";
	}

	@RequestMapping(value = "/saveRequest", method = RequestMethod.POST)
	public String saveRequesterDetails(@Validated @ModelAttribute("reqForm") RequesterModel requester,
			BindingResult result, ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "RequesterRegister";
		} else {
			log.info("invoking saveRequesterDetails method");
			Random r = new Random();
			int reqid = r.nextInt(99999) + 10000;
			requester.setrId(reqid);
			bbmsService.saveRequesterdetails(requester);

			viewPage = "success1";
		}
		return viewPage;
	}

	@RequestMapping(value = "/donate", method = RequestMethod.GET)
	public String saveDonorData(ModelMap map) {
		log.info("inside donorData method");
		DonorModel donor = new DonorModel();
		map.addAttribute("donorForm", donor);
		return "DonorRegister";
	}

	@RequestMapping(value = "/saveDonor", method = RequestMethod.POST)
	public String saveDonorDetails(@Validated @ModelAttribute("donorForm") DonorModel donor, BindingResult result,
			ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "DonorRegister";
		} else {

			log.info("calling save Donordetails method");
			bbmsService.saveDonordetails(donor);

			viewPage = "success2";
		}
		return viewPage;
	}

	@RequestMapping(value = "/admin")
	public String admin() {
		log.info("admin  method");

		return "AdminSuccess";
	}

	@RequestMapping(value = "/requestadmin")
	public String updateRequesterStatus(ModelMap map) {
		log.info("calling fetchRequest method");
		List<RequesterModel> requestList = bbmsService.fetchRequest();
		map.addAttribute("reqList", requestList);
		return "RequestSuccess";
	}

	@RequestMapping(value = "/donateadmin")
	public String updateDonorStatus(ModelMap map) {
		log.info("calling fetchRequest method");
		List<DonorModel> donorList = bbmsService.fetchDonor();
		map.addAttribute("donorlist", donorList);
		return "DonorSuccess";
	}

	@RequestMapping(value = "/check")
	public String fetchRegistration(ModelMap map) {
		log.info("calling fetchRegistration method");
		List<UserModel> userList = bbmsService.fetchRegister();
		map.addAttribute("userlist", userList);
		return "UserSuccess";
	}

	@RequestMapping(value = "/fetchById/{rId}")
	public String fetchRequesterById(@PathVariable("rId") Integer rlId, ModelMap map) {
		log.info("fetching RequesterInfoById");
		RequesterModel request = bbmsService.fetchReqById(rlId);
		map.addAttribute("editForm", request);
		return "RequesterUpdate";
	}

	@RequestMapping(value = "/editReq", method = RequestMethod.POST)
	public String updateRequester(@Validated @ModelAttribute("rForm") RequesterModel request, BindingResult result) {

		log.info("invoking method to update data");
		bbmsService.updateRequest(request);

		return "RequesterSuccess2";

	}

	@RequestMapping(value = "/fetchByDonorId/{pid}")
	public String fetchDonorById(@PathVariable("pid") Integer pId, ModelMap map) {
		log.info("fetching donorInfoById");
		DonorModel donor = bbmsService.fetchRequestById(pId);
		map.addAttribute("editform", donor);
		return "DonorUpdate";
	}

	@RequestMapping(value = "/editDonor", method = RequestMethod.POST)
	public String updateDonor(@Validated @ModelAttribute("dForm") DonorModel donor, BindingResult result) {

		log.info("invoking method to update data");
		bbmsService.updateDonor(donor);

		return "DonorSuccess2";

	}

}
