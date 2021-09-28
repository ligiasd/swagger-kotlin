package io.redspark.candidatos.modules.login.controller
import io.redspark.candidatos.models.dtos.CreateUserDTO
import io.redspark.candidatos.models.dtos.UserDTO
import io.redspark.candidatos.models.dtos.UserListDTO
import io.redspark.candidatos.modules.login.service.UserService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@Api(value = "login")
@RequestMapping("/me")
class UserController(
    private val userService: UserService,

    ) {

    @GetMapping
    fun getUserList(): List<UserListDTO> = userService.getUserList()

    @PostMapping
    fun createUser(@RequestBody @Valid createUserDTO: CreateUserDTO): UserDTO = userService.createUser(createUserDTO)

}
//    @ApiOperation(value = "Login")
//    @GetMapping
//    fun getUser(@RequestHeader("Accept-Encoding") header: RequestHeader): String{//
//    return userService.getUser(user)

//    @ApiOperation(value = "Login")
//    @GetMapping
//    fun getUser(@RequestHeader user: UserDTO): String{
//        return userService.getUser(user)
//    }


