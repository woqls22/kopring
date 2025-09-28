package com.study.kotlinspring.day1.domain

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = "users")
data class User(
    @Id
    val id: String? = null, // id가 null이면 es에서 자동 생성함.
    val name: String,
    val age: Int
)