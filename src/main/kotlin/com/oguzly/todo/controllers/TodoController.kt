package com.oguzly.todo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class TodoController {
    @GetMapping
    fun index(): String
    {
        return "Todo list";
    }

    @PostMapping
    fun store(@RequestBody todo: String): String
    {
        return "Success saved";
    }
}