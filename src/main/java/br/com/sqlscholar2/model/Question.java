package br.com.sqlscholar2.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.json.bind.Jsonb;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(generator = "UUID")
    @PrimaryKeyJoinColumn
    private UUID id;
    
    @Column
    private String title;
 
    @Column
    private String description;
    
    @Column
    private Jsonb sql;
    
    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @ManyToOne
    @JoinColumn(name = "questionlist_id")
    private QuestionList questionList;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User owner;
    
    @Column
    private String difficulty;
    
}
