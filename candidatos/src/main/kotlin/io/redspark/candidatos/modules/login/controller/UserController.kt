package io.redspark.candidatos.modules.login.controller
import io.redspark.candidatos.models.dtos.UserDTO
import io.redspark.candidatos.modules.login.service.UserService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
@Api(value = "login")
@RequestMapping("/me")
class UserController(
    private val userService: UserService,

    ) {

    @ApiOperation(value = "Login")
    @GetMapping
    fun getUser(@RequestHeader user: UserDTO): String{
        return userService.getUser(user)
    }


}