package com.example.sparkinho1.modules.services

import com.example.sparkinho1.models.user.UserDTO

interface UserService {

    fun getUserList(): List<UserDTO>
    fun createUser(userDTO: UserDTO): UserDTO
    fun getUser(id: Int): UserDTO

}