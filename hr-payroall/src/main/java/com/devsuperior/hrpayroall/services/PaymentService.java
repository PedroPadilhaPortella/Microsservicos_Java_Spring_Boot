package com.devsuperior.hrpayroall.services;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroall.entities.Payment;

@Service()
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Pedro Portella", 100.00, days);
	}

}
