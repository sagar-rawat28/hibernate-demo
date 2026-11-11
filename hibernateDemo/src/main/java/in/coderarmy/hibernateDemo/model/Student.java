package in.coderarmy.hibernateDemo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name="students")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false,
            length = 100,
            name="student_name")
    private String name;



    @Column(unique = true,
            length = 150,
            nullable = false,
            insertable = true,
            updatable = true
    )
    private String email;


    @Column(nullable = false)
    private int age;

    @ElementCollection
    @CollectionTable(
            name="student_address",
            joinColumns = @JoinColumn(name="student_id")
    )
    private Set<Address> addresses;



//    @ElementCollection
//    @CollectionTable(
//            name="student_skills",
//            joinColumns = @JoinColumn(name="student_id")
//    )
//    private Set<String> skills;


//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(
//                    name="houseNo",
//                    column=@Column(name="current_house_no")
//            ),
//            @AttributeOverride(
//                    name="street",
//                    column=@Column(name="current_street")
//            ),
//            @AttributeOverride(
//                    name="city",
//                    column=@Column(name="current_city")
//            ),
//            @AttributeOverride(
//                    name="state",
//                    column=@Column(name="current_state")
//            ),
//            @AttributeOverride(
//                    name="pincode",
//                    column=@Column(name="current_pincode")
//            )
//    })
//    private Address currentAddress;
//
//
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(
//                    name="houseNo",
//                    column=@Column(name="parmanent_house_no")
//            ),
//            @AttributeOverride(
//                    name="street",
//                    column=@Column(name="permanent_street")
//            ),
//            @AttributeOverride(
//                    name="city",
//                    column=@Column(name="permanent_city")
//            ),
//            @AttributeOverride(
//                    name="state",
//                    column=@Column(name="permanent_state")
//            ),
//            @AttributeOverride(
//                    name="pincode",
//                    column=@Column(name="permanent_pincode")
//            )
//    })
//    private Address permanentAddress;

//    @Column(precision = 5,scale = 2)
//    private BigDecimal percentage;
//
//    private LocalDate dateOfBirth;
//
//    @Enumerated(EnumType.STRING)
//    private StudentStatus status;
//
//    //Lob is large object mapping.
//    @Lob
//    private String profileDescription;
//
//
//    //Transient is just for keeping property not participation in databases. You can check it in db.
//    @Transient
//    private String displayName;
//
//    @Convert(converter = BooleanToStringConvertor.class)
//    private boolean isMonitor;
//
//
//    private LocalDateTime createdAt;


    public Student() {}

    public Student(Long id, String name, String email, int age, Set<Address> addresses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.addresses = addresses;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}