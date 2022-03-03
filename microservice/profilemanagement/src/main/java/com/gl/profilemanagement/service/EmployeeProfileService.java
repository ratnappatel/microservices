package com.gl.profilemanagement.service;

import java.util.List;

import com.gl.profilemanagement.domain.EmployeeProfile;

public interface EmployeeProfileService {
	void addEmployeeProfile(EmployeeProfile profile);
	List<EmployeeProfile> getEmployeeProfiles();
}
