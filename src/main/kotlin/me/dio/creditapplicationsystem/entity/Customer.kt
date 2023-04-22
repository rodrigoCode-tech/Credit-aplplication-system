package me.dio.creditapplicationsystem.entity

data class Customer(
    var firstName: String ="",
    var lastName: String = "",
    val cpf : String ="",
    var email: String ="",
    var password :String ="",
    var adress: Address = Address(),
    var credits : List<Credit> = mutableListOf(),
    val id : Long? = null
 )
