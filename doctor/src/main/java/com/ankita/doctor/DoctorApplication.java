package com.ankita.doctor;

import com.ankita.doctor.dao.IDoctorDao;
import com.ankita.doctor.domain.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoctorApplication implements CommandLineRunner {
	@Autowired
	IDoctorDao doctorDao;
	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
		System.out.println("Hello GM Doctor");

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Storing data in Doctor");
		doctorDao.save(new Doctor(null,"ankita", "vaidya", "940358197", "ankita.vaidya@netcracker.com"));
		doctorDao.save(new Doctor(null,"nikita", "deshmukh", "940358197", "ankita.vaidya@netcracker.com"));
		doctorDao.save(new Doctor(null,"suchita", "valesh", "940358197", "ankita.vaidya@netcracker.com"));

	}
}
