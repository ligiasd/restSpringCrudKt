package com.example.sparkinho1.modules.repository

import com.example.sparkinho1.models.user.UserDTO




interface UserRepository {

    fun getUserList(): List<UserDTO>
    fun createUser(UserDTO: UserDTO):UserDTO
    fun getUser(id: Int): UserDTO?
    fun removeUser(id: Int): UserDTO?
    fun updateUser(id: Int, userDTO: UserDTO): UserDTO

}