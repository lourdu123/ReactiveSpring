package com.lourdu.ClientModule;

import com.lourdu.domain.Doctor;
import com.lourdu.domain.Employee;
import com.lourdu.domain.HospitalManagement;
import com.lourdu.domain.Nurse;

public class ClientModule {

    public static void main(String[] args) {

        Employee employee = new Nurse(101, "beggy", "nurse", true);

        HospitalManagement hManagement = new HospitalManagement();
        hManagement.callUpon(employee);

        System.out.println("***************");

        Employee employee1 = new Doctor(101, "suzan", "doctor", true);
        hManagement.callUpon(employee1);

    }
}
