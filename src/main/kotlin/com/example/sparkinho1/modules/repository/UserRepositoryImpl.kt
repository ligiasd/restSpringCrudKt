package com.example.sparkinho1.modules.repository


import com.example.sparkinho1.models.user.UserDTO
import org.springframework.stereotype.Component

@Component
class UserRepositoryImpl : UserRepository {

    private val repository : MutableMap<Int, UserDTO> = mutableMapOf()
    override fun getUserList(): List<UserDTO> {
        return repository.values.toList()

    }

    override fun createUser(userDTO: UserDTO): UserDTO {
        val maxId : Int = repository.keys.maxOrNull() ?: 0
        val id = maxId +1
        userDTO.id = id
        repository.put(id,userDTO)
        return userDTO
    }

    override fun getUser(id: Int): UserDTO? {
        return repository.get(id)
    }


}