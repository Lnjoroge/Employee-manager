package njoroge.assignment.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false, updatable = false)
    private Long id;
    private String name;
    private String phone;
    private String title;
    @Column(nullable=false, updatable = false)
    private String employeeCode;

    public Employee() {}

    public Employee(String name, String phone, String employeeCode) {
        this.name=name;
        this.phone=phone;
        this.title=title;
        this.employeeCode=employeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getTitle() {
        return title;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public void setEmployeeCode(String toString) {
    }
}


