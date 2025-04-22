package com.ankita.doctor.service;

import com.ankita.doctor.dao.IDoctorDao;
import com.ankita.doctor.domain.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements IDoctorService {

    @Autowired
    IDoctorDao doctorDao;

    @Override
    public void addDoctor(Doctor doctor) {
         doctorDao.save(doctor);
    }

    @Override
    public Doctor getDoctor(Integer doctorId) {
        return doctorDao.findById(doctorId).get();
    }

    @Override
    public void updateDoctor(Doctor doctor) {
         doctorDao.save(doctor);
    }

    @Override
    public boolean deleteDoctor(Integer doctorId) {
        if (doctorDao.existsById(doctorId)) {
            doctorDao.deleteById(doctorId);
            return true;
        }
        return false;
    }

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorDao.findAll();
    }
}
