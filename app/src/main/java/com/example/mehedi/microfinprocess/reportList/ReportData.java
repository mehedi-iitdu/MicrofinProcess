package com.example.mehedi.microfinprocess.reportList;

/**
 * Created by mehedi on 1/25/17.
 */

public class ReportData {

    String color_code;
    String report_no;
    String report_name;

    public ReportData(String color_code, String report_no, String report_name) {
        this.color_code = color_code;
        this.report_no = report_no;
        this.report_name = report_name;
    }

    public String getColor_code() {
        return color_code;
    }

    public void setColor_code(String color_code) {
        this.color_code = color_code;
    }

    public String getReport_no() {
        return report_no;
    }

    public void setReport_no(String report_no) {
        this.report_no = report_no;
    }

    public String getReport_name() {
        return report_name;
    }

    public void setReport_name(String report_name) {
        this.report_name = report_name;
    }

}
