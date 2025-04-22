package com.ankita.doctor.dao;

import com.ankita.doctor.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorDao extends JpaRepository<Doctor, Integer> {

}
