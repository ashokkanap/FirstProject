package com.techprimers.springboot.swaggerexample.resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @ApiOperation(value = "Returns Hello World")
    @ApiResponses(
            value ={
                    @ApiResponse(code= 100,message = "100 is the message"),
                    @ApiResponse(code= 200,message = "Succesfull Hello world")
            }
    )
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @ApiOperation(value = "Returns Hello World")
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello){
        return hello;
    }
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }

}
