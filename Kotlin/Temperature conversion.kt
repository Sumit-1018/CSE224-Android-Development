fun main(){
    var celsius= 50
    var fahrenheit = 100
    ctof(celsius)
    ftoc(fahrenheit)
}
//celsius to fahrenheit
fun ctof(c:Int){
    var f= ((c*9/5)+32)
    println("Fahrenheit: $f")
}
//fahrenheit to celsius
fun ftoc(f:Int){
    var c= ((f-32)*5/9)
    println("Celsius: $c")
}