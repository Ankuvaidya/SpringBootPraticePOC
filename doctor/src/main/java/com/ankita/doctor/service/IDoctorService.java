package com.ankita.doctor.service;

import com.ankita.doctor.domain.Doctor;

import java.util.List;

public interface IDoctorService {
    public void addDoctor(Doctor doctor);

    public Doctor getDoctor(Integer doctorId);

    public void updateDoctor(Doctor doctor);

    public boolean deleteDoctor(Integer doctorId);

    public List<Doctor> getAllDoctor();

}
