package com.example.kotlinwebfluxexample.helloworld.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/hello/")
@RestController
class TestController {

    @GetMapping("get-test/{test}")
    fun test(@PathVariable test: String): String {

        return test
    }
}