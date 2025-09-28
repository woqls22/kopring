package com.study.kotlinspring.day1.service

import com.study.kotlinspring.day1.domain.User
import com.study.kotlinspring.day1.repository.UserRepository
import org.springframework.data.elasticsearch.core.ReactiveElasticsearchOperations
import org.springframework.data.elasticsearch.core.query.Query
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserService(
    private val userRepository: UserRepository,
    private val esOps: ReactiveElasticsearchOperations
) {
    fun createUser(user: User): Mono<User> = userRepository.save(user)
    fun getUserById(id: String): Mono<User> = userRepository.findById(id)
    fun updateUser(user: User): Mono<User> = userRepository.save(user)
    fun deleteUesr(id: String): Mono<Void> = userRepository.deleteById(id)
    fun getAllUsers(): Flux<User> = esOps.search(Query.findAll(), User::class.java)
        .map { it.content }
}