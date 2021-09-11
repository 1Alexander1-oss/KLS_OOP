fun main() {
//    https://metanit.com/kotlin/tutorial/2.3.php

//    for (i in 1..9) {
//        for (j in 1..9) {
//            print("${i * j} \t")
//        }
//        println()
//    }

////    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//    val n = numbers[1]
//    numbers[2] = 7
//    println("numbers[2] = ${numbers[2]}")

//    val numbers = Array(3, {5})

//    val animals = arrayOf("cat", "dog", "maus")
//        for (person in animals) {
//            print("$person \n")
//    }
//    val dog = animals [1]
//    println(dog)

    val numbers: ArrayList<Int> = arrayListOf()
    for (number in 0..100) {
        numbers.add(number)
    }

    var i = 0
    while (i in numbers.indices) {
        println(numbers[i])
        i++
    }
}