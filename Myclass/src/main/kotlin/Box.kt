    class Box
    {
        var length : Int =2
        var width : Int = 3
        var height  : Int = 4
        var volume = length * width * height

        //behavior of the box
        fun fillContents() {
            println("Box is filled")
        }

        fun open(){
            println("Box Opened")
        }
    }

