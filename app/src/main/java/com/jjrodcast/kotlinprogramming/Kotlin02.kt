package com.jjrodcast.kotlinprogramming

// POO: Programación Orientada a Objetos

// 1: Crear una clase
class Car(val version: String, val year: String)
data class CarData(val version: String, val year: String)


// 2. Clases Abstractas
abstract class AbstractCar(val year: String)
data class SimpleCar(val version: String) : AbstractCar("2024")

// Usar open
open class AbstractCarOpen(open val year: String)
data class DynamicCar(val version: String, override val year: String) : AbstractCarOpen(year)

// Modificar el acceso de la variable de la clase abstracta
abstract class AbstractCar2(open val year: String) {

    fun start() {
        println("Car started")
    }
}

data class SimpleCar2(val version: String, override val year: String) : AbstractCar2(year)


// 3. Interfaces
interface CarInterface {
    val year: String
    fun start(): String
}

data class CarInterfaceImpl(val version: String, override val year: String) : CarInterface {
    override fun start(): String {
        return "Car started"
    }
}

//4. Sobrecarga de métodos
data class CarOverload(val version: String) {
    var year: String = "000"

    constructor(version: String, year: String) : this(version) {
        this.year = year
    }
}


data class CarOverload2(val version: String, val year: String = "000", val owner: String = "---")

// 5. Sealed class
sealed class State(open val name: String) {
    data class Data(override val name: String) : State(name)
    data object Loading : State("Yellow")
}

fun main() {

    val state: State = State.Data("my data")
    when (state) {
        is State.Data -> println("This is ${state.name}")
        State.Loading -> println("This is ${state.name} --")
    }

}