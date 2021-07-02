package com.example.sparkinho1.modules.services

import com.example.sparkinho1.models.user.UserDTO
import com.example.sparkinho1.modules.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UserServiceImpl (
    private val repository: UserRepository
): UserService {

    override fun getUserList() : List<UserDTO> {
        return repository.getUserList()
    }

    override fun createUser(userDTO: UserDTO): UserDTO {
        if (userDTO.id != null) {
            throw Exception("id.not.null")
        }
        return repository.createUser(userDTO)
    }

    override fun getUser(id: Int): UserDTO {
        val userDTO : UserDTO? = repository.getUser(id)

        if (userDTO == null){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "user.not.found")
        }
        return userDTO

    }
    override fun deleteUser(id : Int): UserDTO {
        val userDTO : UserDTO?= repository.removeUser(id)

        if ( userDTO == null){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "user.not.found")
        }
        return userDTO



    }

    override fun updateUser(user: Int, userDTO: UserDTO): UserDTO {


        if ( user == null){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "user.not.found")
        }
        return repository.updateUser(user, userDTO)

    }
}
