package com.healthcare_enmasse.doctor;

public class Doctor {
    
    public int id;
    public String firstName;
    public String lastName;
    public String emailAddress;
    public int age;
    public String dateOfBirth;
    public String licenseNumber;
    public String specialization;
    public enum employmentStatus {
        Unemployed,
        Employed,
        Part_time
    };
    public employmentStatus employmentStatus;


    // Setters
    public void setID(int id){
        this.id = id;
    }

    public void setFirstName( String firstName) {
        this.firstName = firstName;     
    }

    
    public void setLastName( String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress( String emailAddress) {
        this.emailAddress = emailAddress;
        
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setEmploymentStatus(employmentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;;
    }


    // Getters
    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public int getAge() {
        return this.age;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public employmentStatus getEmploymentStatus() {
        return this.employmentStatus;
    }
}
