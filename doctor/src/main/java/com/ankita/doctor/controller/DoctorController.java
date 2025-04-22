package com.ankita.doctor.controller;

import com.ankita.doctor.service.DoctorServiceImpl;
import com.ankita.doctor.domain.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorServiceImpl doctorServiceImpl;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorServiceImpl.addDoctor(doctor);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping
    public void updateDoctor(@RequestBody Doctor doctor) {
        doctorServiceImpl.updateDoctor(doctor);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(path = "/{doctorId}")
    public boolean deleteDoctor(@PathVariable("doctorId") Integer doctorID) {
        return doctorServiceImpl.deleteDoctor(doctorID);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{doctorId}")
    public Doctor getDoctorById(@PathVariable("doctorId") Integer doctorId) {
        return doctorServiceImpl.getDoctor(doctorId);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Doctor> getAllDoctor() {
        return doctorServiceImpl.getAllDoctor();
    }


}
