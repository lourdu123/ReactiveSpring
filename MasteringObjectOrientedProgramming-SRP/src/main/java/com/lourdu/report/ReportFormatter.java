package com.lourdu.report;

public class ReportFormatter {

    public ReportFormatter(Object object, ReportType type) {

        switch (type) {
            case XML:
                convertObjectToXML(object);
                break;
            case CSV:
                convertObjectToCSV(object);
                break;
        }

    }

    public void convertObjectToXML(Object object) {
        System.out.println("converting object to XML");
    }

    public void convertObjectToCSV(Object object) {
        System.out.println("converting object to CSV");
    }

}
