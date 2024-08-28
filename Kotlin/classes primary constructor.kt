class Person(var name:String, var age:Int){
    constructor(x:String):this(){
        name=x
        age=10
    }
    constructor():this("Sumit",30)
    fun display(){
        println("Name: $name Age: $age")
    }
}
fun main(){
    var name= readln()
    var a=Person(name,20)
    a.display()
    var b=Person(name)
    b.display()
    var c=Person()
    c.display()
}