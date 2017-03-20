package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "User", uniqueConstraints = {@UniqueConstraint(columnNames = "USERID"), @UniqueConstraint(columnNames = "NAME")})

public class User implements Serializable {

    @Id
    @Column(name = "USERID", unique = true, nullable = false)
    private Integer userID;
    @Column(name = "EMAIL", unique = true, nullable = false, length = 100)
    private String            email;
    @Column(name = "NAME", unique = false, nullable = false, length = 100)
    private String name;
    @Column(name = "PASSWORD", unique = false, nullable = false, length = 100)
    private String password;

    public Integer getUserID() { return userID; }

    public void setUserID(Integer userID) {this.userID = userID; }

    public String getEmail() { return email; }

    public void setEmail(String email)  { this.email = email; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }
}
