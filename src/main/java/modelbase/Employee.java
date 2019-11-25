package modelbase;

import enums.GenderEnum;

import java.util.Date;

public class Employee {

    private Integer emp_no;

    private Date birth_data;

    private String first_name;

    private String last_name;

    private GenderEnum gender;

    private Date hire_date;

    public Employee() {
    }

    public Employee(Integer emp_no, Date birth_data, String first_name, String last_name, Date hire_date) {
        this.emp_no = emp_no;
        this.birth_data = birth_data;
        this.first_name = first_name;
        this.last_name = last_name;
        this.hire_date = hire_date;
    }

    public Integer getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(Integer emp_no) {
        this.emp_no = emp_no;
    }

    public Date getBirth_data() {
        return birth_data;
    }

    public void setBirth_data(Date birth_data) {
        this.birth_data = birth_data;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_no=" + emp_no +
                ", birth_data=" + birth_data +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender=" + gender +
                ", hire_date=" + hire_date +
                '}';
    }
}
