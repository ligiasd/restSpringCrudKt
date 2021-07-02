package com.example.sparkinho1.modules.controllers

import com.example.sparkinho1.models.user.UserDTO
import com.example.sparkinho1.modules.services.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController (
    private val userService: UserService
        ){

    @GetMapping
    fun getUserList(): List<UserDTO> = userService.getUserList()

    @PostMapping
    fun createUser(@RequestBody userDTO: UserDTO): UserDTO = userService.createUser(userDTO)

    @GetMapping("{id}")
    fun getUser(@PathVariable id: Int): UserDTO = userService.getUser(id)



}


