package com.controller;

import com.dao.PaymentDao;
import com.dao.UserDao;

public class UserController {

	public UserDao userDao;

	public PaymentDao paymentDao;

	public UserController(UserDao userDao) {
		this.userDao = userDao;
	}

	public PaymentDao getPaymentDao() {
		return paymentDao;
	}

	public void setPaymentDao(PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}

}
