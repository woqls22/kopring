package com.study.kotlinspring.day1.repository

import com.study.kotlinspring.day1.domain.User
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository
import reactor.core.publisher.Mono

// ReactiveRepository는 webFlux에서 비동기로 처리할 수 있다.
interface UserRepository : ReactiveElasticsearchRepository<User, String> {
    fun findByName(name: String): Mono<User>
}