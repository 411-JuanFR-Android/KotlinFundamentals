package com.pjasoft.lib
/* 1. Crea un programa, que tenga un precio de comida y un porcentaje de propina.
        e imprimir cuanto es el total a pagar
 */
// String Interpolation
// QUE UN HILO????? NULL SAFETY
fun main(){
    println("Hola mundo")
    // 1.
    val price : Double = 150.0
    val percentage : Double = 0.10
    val tip : Double = price * percentage
    val total : Double = price + tip
    println("El costo de la comida es: $$total")


    //El portero de la discoteca. Verifica que una persona puedra entrar en la disco.
    // SOlo si es mayor de edad
    println("Pon una edad")
    val input = readlnOrNull()
    val age = input?.toIntOrNull()
    // Utilizar WHEN en lugar de if else
    // cmd K cmd C
    // Ctrl K Ctrl C
    // Ctrl K Ctrl U
//    if(age == null){
//        println("El numero que pusiste pa, no es un numero entero, insertalo bien!!!")
//    }
//    else if(age > 18){
//        println("Eres mayor edad, pasale a la discoteca")
//    }
//    else{
//        println("No puedes pasar pai")
//    }
    // RANGOS!!!!!
    for(i in 1..10){
        println(i)
    }

    // Ciclo for al reves
    for(i in 10 downTo 2){
        println(i)
    }

    for(i in 100 downTo 0 step 10){
        println(i)
    }

    // When
    when(age){
        null -> println("Ingresa un numero valido pa")
        in 18..Integer.MAX_VALUE -> println("Entrale")
        else -> println("No puedes pasar pai")
    }

    var counter : Int = 12
    while(counter < 20){
        println("El contador es menor que 20")
        counter++
    }

    // DO WHILE -> Ejecuta primero el bloque de codigo y DESPUES evalua la condicion
    // Operadores logicos: && ||
    // Operador aritmetico: + - * / %
    do {
        println("El contador vale menos que 30")
        counter++
    }
        while(counter < 30)
    // Determinar si un número ingresado por el usuario es un número primo
}