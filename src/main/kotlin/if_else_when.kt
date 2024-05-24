fun main(array: Array<String>) {

    val a=30;
    val b=20;
    val greaterNumber = if (a > b) {
        a
    } else {
        b
    }
    val height=10;
    val printHeight="Height is ${if (height>5) "above 5 feet" else "less than or equal to 5 feet"} ";

//    println(greaterNumber)
    println(printHeight)
}