package com.javatechie.spring.soap.api;

import com.javatechie.spring.soap.api.client.SoapClient;
import com.javatechie.spring.soap.api.loaneligibility.Acknowledgement;
import com.javatechie.spring.soap.api.loaneligibility.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSoapWsClientApplication {

	@Autowired
	private SoapClient client;

	@PostMapping("/getLoanStatus")
	public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request){
		return client.getLoanStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWsClientApplication.class, args);
	}

}
