package com.example.note.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Entity
@Table(name = "Note")
data class Note(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    var idx: Long,

    @Column(name = "name")
    var name: String,

    @Column(name = "title")
    var title: String,

    @Column(name = "content", length = 3000)
    var content: String,

    @Column(name = "createdAt")
    @CreatedDate
    var createdAt: LocalDateTime
)