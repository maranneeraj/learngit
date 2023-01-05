    class Car {
        var brand = ""
        var model = ""
        var year = 0
        var variety = 'a'
    }
    fun main() {
        val c1 = Car()
        val c2 = Car()
        c1.brand = "Ford"
        c1.model = "Mustang"
        c1.year = 1969
        c1.variety = 'A'
        println("Car no. ONE details : " +c1.brand)
        println(c1.model)
        println(c1.year)
        println(c1.variety)

        c2.brand = "Mercedes"
        c2.model = "Benz"
        c2.year = 1980
        c2.variety = 'C'
        println("Car no. TWO details : " +c2.brand)
        println(c2.model)
        println(c2.year)
        println(c2.variety)
    }
