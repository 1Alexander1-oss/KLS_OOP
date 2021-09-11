fun main() {
    val  short: Short = 1
    val dog = Dog(name = "Bonya")
    val cat = Cat(name = "Cot")
    val mouse = Mouse(name = "Mikkie")
    val duck = Duck(name = "Donald")
    val tiger = Tiger(name = "Sherhan")

    val animals = arrayListOf(dog, cat, mouse, duck, tiger)
//    for (animal in animals) {
//        if (animal is Dog) {
//            animal.bark()
//        } else if (animal is Cat) {
//            animal.meow()
//        } else if (animal is Mouse) {
//            animal.pipipi()
//        } else if (animal is Duck) {
//            animal.crya()
//        } else if (animal is Tiger) {
//            animal.rrrr()
//        }
//    }
    for (animal in animals){
        animal.voice()
    }
}

interface Animal {
    val name: String
    fun voice()
}

class Dog(override val name: String) : Animal {
    fun bark() {
        println("bark")
    }

    override fun voice() {
        bark()
    }
}

class Cat(override val name: String) : Animal {
    fun meow() {
        println("meuw")
    }

    override fun voice() {
        meow()
    }
}

class Mouse(override val name: String) : Animal {
    override fun voice() {
        println("pipipi")
    }
}

class Duck(override val name: String) : Animal {
    fun crya() {
        println("crya")
    }

    override fun voice() {
        crya()
    }
}

class Tiger(override val name: String) : Animal {
    override fun voice() {
        println("rrrr")
    }
}

//class Dog(val name: String) {
//    fun bark() {
//        println("bark")
//    }
//}
//
//class Cat(val name: String) {
//    fun meow() {
//        println("meuw")
//    }
//}
//
//class Mouse(val name: String) {
//    fun pipipi() {
//        println("pipipi")
//    }
//}
//
//class Duck(val name: String) {
//    fun crya() {
//        println("crya")
//    }
//}
//
//class Tiger(val name: String) {
//    fun rrrr() {
//        println("rrrr")
//    }
//}
