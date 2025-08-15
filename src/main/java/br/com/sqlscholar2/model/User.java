package br.com.sqlscholar2.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    
    @Column
    private String username;

    @Column(unique = true)
    private String email;

    @Column
    private String firstName;
    
    @Column
    private String lastName;
    
    @Column
    private String password;
    
    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @Column
    private boolean isTeacher;

    public User(String username, String email, String firstName, 
    String lastName, String password, boolean isTeacher) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.isTeacher = isTeacher;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isTeacher() {
        return isTeacher;
    }

    public void setTeacher(boolean isTeacher) {
        this.isTeacher = isTeacher;
    }

}
