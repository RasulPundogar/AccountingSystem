/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Happi6
 */
public class Payroll {
    private String employee_id;
    private String branch_id;
    private String job_description;
    private float rate_per_day;
    private float rate_per_hour;
    private int days_worked;
    private int RD_worked; // Rest Day
    private int SH_worked; // Special Holiday
    private int OT_worked; // Overtime
    private int late; // tardiness
    private float philhealth;
    private float pagibig;
    private float deductions_other;
}
