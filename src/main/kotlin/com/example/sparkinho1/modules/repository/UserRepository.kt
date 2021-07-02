package com.example.sparkinho1.modules.repository

import com.example.sparkinho1.models.user.UserDTO




interface UserRepository {

    fun getUserList(): List<UserDTO>

    fun createUser(UserDTO: UserDTO):UserDTO
    fun getUser(id: Int): UserDTO?

}