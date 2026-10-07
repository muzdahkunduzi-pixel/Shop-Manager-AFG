package com.shopmanager.afg

data class Product(
    val id: Int = 0,
    var name: String,
    var buyPrice: Double,
    var sellPrice: Double,
    var quantity: Int
) {
    fun profit(): Double {
        return (sellPrice - buyPrice) * quantity
    }
}
