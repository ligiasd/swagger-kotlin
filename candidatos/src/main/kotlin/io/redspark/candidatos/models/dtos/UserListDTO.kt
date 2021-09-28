package io.redspark.candidatos.models.dtos


import io.redspark.candidatos.database.entities.User
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class UserListDTO (
    @JsonProperty("id")
    val id: UUID?,

    @JsonProperty("email")
    val email: String

){
    constructor(user: User): this(
        id = user.id,
        email = user.email

    )
}

