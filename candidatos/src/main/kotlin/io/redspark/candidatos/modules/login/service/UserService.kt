package io.redspark.candidatos.modules.login.service

import io.redspark.candidatos.models.dtos.UserDTO


interface UserService {
    abstract fun getUser(user: UserDTO): String

}