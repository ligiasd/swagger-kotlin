package io.redspark.candidatos.modules.login.service

import io.redspark.candidatos.database.repository.UserRepository
import io.redspark.candidatos.models.dtos.UserDTO
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
): UserService{

    override fun getUser(user: UserDTO): String {
        TODO("Not yet implemented")
    }

}
