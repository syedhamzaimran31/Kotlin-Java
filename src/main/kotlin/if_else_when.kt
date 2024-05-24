fun main(array: Array<String>) {

    val a = 30;
    val b = 20;
    val greaterNumber = if (a > b) {
        a
    } else {
        b
    }
    val height = 10;
    val printHeight = "Height is ${if (height > 5) "above 5 feet" else "less than or equal to 5 feet"} ";

    val soldiersPassingBridge = true;
    val troopsCount = 2000
    val actionToTake =
        if (troopsCount > 1000 && soldiersPassingBridge) {
            "Use Artillery"
        } else if (soldiersPassingBridge) {
            "Shoot them"
        } else "Hold ground until reinforcements arrive"

    val rating=2;

    when(rating){
        1-> print("Your rating is: $rating , you have to work hard"  )
        2-> print("Your rating is: $rating , you can do better ")
        3-> print("Your rating is: $rating , your performance is above average , focus more")
        4-> print("Your rating is: $rating , your doing good" )
        5-> print("Your rating is: $rating , Excellent work!!")
        else->{
            println("No rating")
        }

    }


//    println(actionToTake)
//    println(greaterNumber)
//    println(printHeight)
}