package com.techprimers.springboot.swaggerexample.resource;

import io.swagger.annotations.ApiModelProperty;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Sam", 2000L),
                new User("Peter", 1000L)
        );
    }

    @GetMapping("/{user}")
    public User getUser(@PathVariable("userName") final String userName)
    {
        return new User(userName, 1000L);
    }

    private class User {
        @ApiModelProperty(notes ="Salary of the User")
        private String userName;
        @ApiModelProperty(notes ="name of the User")
        private Long salary;

        public User(String userName, Long salary) {
            this.userName = userName;
            this.salary = salary;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }

    }

}