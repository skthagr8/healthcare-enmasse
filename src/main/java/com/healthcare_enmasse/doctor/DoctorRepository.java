package com.healthcare_enmasse.doctor;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addDoctor(Doctor doctor){
        String insertQuery =  "INSERT INTO doctors(id, firstname, lastname, emailaddress, age, dateofbirth, licensenumber, specialization, employmentstatus) VALUES (?,?,?,?,?,?,?,?,?)";

        return jdbcTemplate.update(
        insertQuery,
        doctor.getID(),
        doctor.getFirstName(),
        doctor.getLastName(),
        doctor.getEmailAddress(),
        doctor.getAge(),
        doctor.getDateOfBirth(),
        doctor.getLicenseNumber(),
        doctor.getSpecialization(),
        doctor.getEmploymentStatus()
    );
}
}
