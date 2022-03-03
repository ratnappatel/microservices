package com.gl.profilemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.profilemanagement.domain.EmployeeProfile;

@Repository
public interface ProfileRepository extends JpaRepository<EmployeeProfile,Integer> {
}
