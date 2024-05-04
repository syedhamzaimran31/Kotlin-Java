fun main(args: Array<String>) {
//Fibonacci Series
    var a = 0;
    var b = 1;
    var c = 0;
    var count = 10;

    print("$a $b")

    for (i in 1..count - 2) {
        c = a + b
        a = b
        b = c
        print(" $c")
    }
    println()
//    check if number is positive or negative
    val number = 10;
    if (number > 0) {
        println(" $number is a positive Number")
    } else {
        println(" $number is a negative number")
    }

}