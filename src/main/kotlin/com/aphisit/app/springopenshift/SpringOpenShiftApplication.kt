package com.aphisit.app.springopenshift

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringOpenShiftApplication

fun main(args: Array<String>) {
    runApplication<SpringOpenShiftApplication>(*args)
}
