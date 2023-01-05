fun main()
{
    val box1 = Box()
    println("Height : ${box1.height}")
    println("Length : ${box1.length}")
    println("Width : ${box1.width}")
    println("Volume of the box : ${box1.volume}")
    val box2 = Box()
    box2.height=20
    box2.length=10
    box2.width=5
    println("Height : ${box2.height}")
    println("Length : ${box2.length}")
    println("Width : ${box2.width}")
    println("Volume of the box : ${box2.volume}")
    box1.open()
    box1.fillContents()

}