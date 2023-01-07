// This is develop branch of the project
class Student(){
    var name = "Neeraj"
    var age = 19

    fun display(){
        println("My name is $name and my age is $age")
    }
}
class Animal(val name:String, val color : String) {
    fun displayDetails()
    {
        println("Name of Animal : $name")
        println("Color of Animal : $color")
    }

}
fun main()
{
    var student1 = Student()
    student1.display()
    student1.name = "Ritu"
    student1.age = 25
    student1.display()

    var animal = Animal("TIGER", "Black")
animal.displayDetails()

    var animal2 = Animal("CROWN", "white")
    animal2.displayDetails()

    var animal3 = Animal("LIGER", "YELLOW-BLACK")
    animal3.displayDetails()

}