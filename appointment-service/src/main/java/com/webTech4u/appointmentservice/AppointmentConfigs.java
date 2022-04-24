package com.webTech4u.appointmentservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("webtech4u-appointment-service")
public class AppointmentConfigs {

	public AppointmentConfigs() {
	}

	private String username;
	private String password;

	public AppointmentConfigs(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AppointmentConfigs{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
