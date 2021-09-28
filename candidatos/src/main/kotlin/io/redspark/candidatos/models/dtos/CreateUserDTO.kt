package io.redspark.candidatos.models.dtos

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateUserDTO(
    @JsonProperty("email")
    val email: String,

)
