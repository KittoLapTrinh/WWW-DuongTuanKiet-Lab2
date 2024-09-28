package backend.models;

import backend.enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries({
        @NamedQuery(
                name = "Employee.findAll", query = "select e from Employee e where e.employeeStatus =: status"
        )
})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;
    @Column(name = "full_name", length = 150)
    private String fullName;
    @Column(columnDefinition = "DATETIME(6)")
    private String dob;
    @Column(length = 150)
    private String email;
    @Column(length = 15)
    private String phone;
    @Column(length = 250)
    private String address;
    @Column(name = "status", columnDefinition = "INT(11)")
    private EmployeeStatus employeeStatus;

    @OneToMany(mappedBy = "employee")
    private List<Order> lstOrder;
}
