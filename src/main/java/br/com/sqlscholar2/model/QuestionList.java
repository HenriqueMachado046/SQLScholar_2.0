package br.com.sqlscholar2.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.json.bind.Jsonb;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

public class QuestionList {
    @Id
    @GeneratedValue(generator = "UUID")
    @PrimaryKeyJoinColumn
    private UUID id;
    
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "questionList")
    private List<Question> questions = new ArrayList<>();
    
    @Column
    private String databaseName;

    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @Column
    private String title;
    
    @Column
    private Jsonb databaseScript;

    @Column
    private String description;
    
    @Column
    private boolean isPrivate;    
    
    @ManyToOne
    private User owner;    
}
