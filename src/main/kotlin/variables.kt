fun main(array: Array<String>) {
    var a=10
    a=50 // var can be re-assigned hence it is mutable
    val b=20
//    b=60 This will give error as val can not be re-assigned hence it is immutable
    print(a+b)
}