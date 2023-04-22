package me.dio.creditapplicationsystem.service

import me.dio.creditapplicationsystem.entity.Credit
import me.dio.creditapplicationsystem.entity.Customer
import org.springframework.stereotype.Service
import java.util.UUID


interface ICreditService {
    fun save(credit: Credit) :Credit
    fun findAllByCustomer(customerId: Long): List<Credit>

    fun findByCreditCode(customerId: Long, creditCode: UUID ): Credit
}