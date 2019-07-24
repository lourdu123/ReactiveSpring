package com.lourdu.client;

import com.lourdu.domain.Laptop;
import com.lourdu.domain.ManufacturingProcess;
import com.lourdu.domain.ManufacturingProcessManagement;
import com.lourdu.domain.SmartPhone;

public class ClientModule {

    public static void main(String[] args) {

        ManufacturingProcessManagement mPManagement = new ManufacturingProcessManagement();
        ManufacturingProcess manufacturingProcess = new SmartPhone("Lenovo");
        mPManagement.manufactureDevice(manufacturingProcess);

        System.out.println("**********");

        ManufacturingProcess manufacturingProcess1 = new Laptop("Dell");
        mPManagement.manufactureDevice(manufacturingProcess1);

    }
}
