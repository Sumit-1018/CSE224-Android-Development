class Intro{
    var name:String
    var age:Int
    constructor(name:String,age:Int){
        this.name=name
        this.age=age
    }
    constructor(name:String){
        this.name=name
        this.age=10
    }
    constructor(){
        this.name="Sumit"
        this.age=30
    }
    fun display(){
        println("Name: $name Age: $age")
    }
}
fun main(){
    var name= readln()
    var a=Intro(name,20)
    a.display()
    var b=Intro(name)
    b.display()
    var c=Intro()
    c.display()
}