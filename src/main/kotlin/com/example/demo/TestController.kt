package com.example.demo

//package org.jetbrains.kotlin.demo

import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

    @GetMapping("/test2")
    fun test2(@RequestParam(value = "number", defaultValue = 3.toString()) number: Int) =
            Greeting(counter.incrementAndGet(), "Your number is: $number")
    //@PostMapping("/postTest")

    //@PutMapping("/putTest")

    //@DeleteMapping('/delTest')




}