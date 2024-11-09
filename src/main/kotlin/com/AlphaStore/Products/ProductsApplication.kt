package com.AlphaStore.Products

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ProductsApplication

fun main(args: Array<String>) {
    runApplication<ProductsApplication>(*args)
}
