fun main(){
    print()
    add(10, 20)
    add1()
    add1(20, 30)
    subtract(20, 10)
}

fun print(){
    println("My name is Sumit")
}
fun add(a:Int, b:Int){
    println("Sum of $a and $b is ${a+b}")
}
fun add1(a:Int=10, b:Int=5){
    /* default value if no argument is passed */
    println("Sum of $a and $b is ${a+b}")
}
fun subtract(a:Int, b:Int){
    println("Difference between $a and $b is ${a-b}")
}