package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    val index: String
        @GetMapping("/")
        get() = "Hello world!"

}