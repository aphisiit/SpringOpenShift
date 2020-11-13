package com.aphisit.app.springopenshift.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class FirstController {

    @GetMapping
    fun index(): String {
        return "index"
    }
}