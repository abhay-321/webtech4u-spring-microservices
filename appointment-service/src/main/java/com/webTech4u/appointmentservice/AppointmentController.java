package com.webTech4u.appointmentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentConfigs configs;

	@GetMapping(path = "/configs")
	public AppointmentConfigs getConfigs() {
		return new AppointmentConfigs(configs.getUsername(), configs.getPassword());
	}
}
