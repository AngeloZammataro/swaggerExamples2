package it2.develhope.swaggerExample2.swaggerExamples2.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it2.develhope.swaggerExample2.swaggerExamples2.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "")
    @ApiOperation(value = "Says Hello World", notes = "Print out the Hello World message for the User")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad imput data"),
            @ApiResponse(code = 500, message = "Internal error from Spring", response = String.class),
            @ApiResponse(code = 202, message = "Created")
    })
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping(value = "/user")
    public User sayHelloToUser(){
        return new User("Angelo","Zammataro","Carini","Palermo");
    }

    @PostMapping(value = "/user")
    public void CreateAUser(@ApiParam(value = "The user request body") @RequestBody(required = false) User user){
    }

    @GetMapping(value = "/name")
    public String sayHelloWithName(@ApiParam(value = "The name of the user") @RequestParam String name){
        return "Hello " + name;
    }

    @GetMapping(value = "/name/{id}")
    public String sayHelloWithNamePath(@ApiParam(value = "The id of the user") @PathVariable String id){
        return "Hello " + id;
    }
}
