package com.jjrodcast.kotlinprogramming

fun variables() {
    // Tipos de variables

    // Variables mutables
    var name = "Jorge"
    name = "Carlos"

    // Variable inmutables
    val age = 30
    println(age)
}

fun variables02() {

    // lateinit
    lateinit var name: String
    name = "Jorge"
    //println(name)

    // lazy
    val nameLazy by lazy { "Jorge Lazy" }
    println(nameLazy)
}

fun dataTypes() {

    // Int
    val number = 10 // var number = 10 (mutable)

    // Float
    val floatNumber = 10.0f // var floatNumber = 10f (mutable)
    //println(floatNumber)

    // Double
    val doubleNumber = 10.0
    //println(doubleNumber)

    // String
    val name = "Jorge"
    //println(name)

    // Listas
    val numberList = listOf(1, 2, 3, 4)
    //println(numberList)

    val genericList = listOf<Any>(1, "2", "3", 4, 5.0f)
    //println(genericList)

    val mutableList = arrayListOf(1, 2, 3)
    mutableList.add(4)
    //println(mutableList)

    val mutableList2 = mutableListOf(10, 20, 30)
    mutableList2.add(40)
    //println(mutableList2)

    // Diccionarios
    val diccionary = mapOf(
        "key1" to 10,
        "key2" to "Jorge"
    )
    //println(diccionary["key3"])


    val mutableDictionary = mutableMapOf(
        "key1" to 10,
        "key2" to "Jorge"
    )
    mutableDictionary["key3"] = 30f // Agregar elementos al map.
    mutableDictionary.put("key4", "Gato") // Agregar elementos al mapa.
    //println(mutableDictionary["key4"])

    mutableDictionary.remove("key4") // Eliminar una key.
    //println(mutableDictionary.keys) // Obtener las llaves del mapa

    // Conjuntos
    val set = setOf(1, 2, 3, 4)
    println(set)

    val mutableSet = mutableSetOf(1, 4, 3, 2)
    mutableSet.add(5)
    mutableSet.add(2)
    println(mutableSet)
}

fun flowControl() {
    // If-else
    val number = 10
    if (number > 10) {
        println("Número $number es mayor a 10")
    } else {
        println("Número $number es menor a 10")
    }

    // if-else-if,else
    if (number > 10) {
        println("Número $number es mayor a 10")
    } else if (number == 10) {
        println("Número $number es 10")
    } else {
        println("Número $number es menor a 10")
    }

    // While
    var index = 0
    while (index < 10) {
       // println(index)
        index++
    }

    // For / foreach
    // for con rangos
    //(100..110).forEach { number -> println(number) } // [100-110]
    //(100..<110).forEach { number -> println(number) } // [100-109]
    //(100..110).forEachIndexed { indice, value -> println("Index = $indice , Value = $value") }

    // for
    val numbers = listOf(1, 2, 3, 4, 5)
    for (value in numbers) {
        println(value)
    }

    for ( (indice, value) in numbers.withIndex() ) {
        println("Index = $indice , Value = $value")
    }

    for(index in 10..15) {
        println(index)
    }
}

fun flowControl2() {
    // When (switch case)
    var number = 10
    when {
        number < 5 -> println("$number es menor a 5")
        number in 5..10 -> println("$number está entre a 5 y 10")
        else -> println("$number es mayor a 5")
    }

    // do-while
    do {
        println(number)
        number++
    } while (number < 15)
}
