package com.study.kotlinspring.day1.controller

import com.study.kotlinspring.day1.domain.User
import com.study.kotlinspring.day1.service.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/day1/api/v1/users")
class Day1Controller(private val userService: UserService) {

    @PostMapping
    fun createUser(@RequestBody user: User): Mono<User> = userService.createUser(user)

    @GetMapping("/{id}")
    fun getUser(@PathVariable("id") id: String): Mono<User> = userService.getUserById(id)

    @GetMapping
    fun getAllUsers(): Flux<User> = userService.getAllUsers()

    @PutMapping("/users/{id}")
    fun updateUser(@PathVariable("id") id: String, @RequestBody user: User): Mono<User> {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable("id") id: String): Mono<Void> = userService.deleteUesr(id)
}