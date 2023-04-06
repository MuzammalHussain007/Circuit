package com.mh.circuit.modal

import java.io.Serializable

data class CategoryItem(
    val itemId : String = "",
    val itemName: String = "",
    val itemImage: Int = -1,
    var checked: Boolean = false
) : Serializable
