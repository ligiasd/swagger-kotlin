package io.redspark.candidatos.models.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.redspark.candidatos.database.entities.User
import java.util.*
import javax.validation.constraints.Email

data class UserDTO (

    @JsonProperty("id")
    val id: UUID?,

    @JsonProperty("email")
    @field:Email
    val email: String
){
    constructor(user: User) : this(
        id = user.id,
        email = user.email,
    )
}