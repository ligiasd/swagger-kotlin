package io.redspark.candidatos.modules.login.service

import io.redspark.candidatos.models.dtos.CreateUserDTO
import io.redspark.candidatos.models.dtos.UserDTO
import io.redspark.candidatos.models.dtos.UserListDTO


interface UserService {
    abstract fun getUser(user: UserDTO): String
    abstract fun getUserList(): List<UserListDTO>
    abstract fun createUser(createUserDto: CreateUserDTO): UserDTO

}