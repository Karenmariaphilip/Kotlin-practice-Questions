fun main() {
    sentence("karen")
    studentRecord("Karen", 23, "0798989097,", 23.0F, "kenyan")
    nameString("Akirachix")
    temperature(12.00)
}
// write a function that takes in a name and prints out "That's me!" when your name is passed to it, otherwise it prints out" I don't know who that is"
fun sentence(name:String){
    var name = "karen"
    if (name=="karen"){
        println("That's me!")
    }else{
        println("I don't know who that is")
    }
}

// You are creating an app to capture students records.Some of the data you will
//capture includes full name, age, phone number, weight in kg and citizen.For the
//citizen field, you will track whether a student is a kenyan or not.
fun studentRecord(fullName:String, age:Int, phoneNumber:String, weight:Float, citizen:String){
    println(fullName)
    println(age)
    println(phoneNumber)
    println(weight)
    println(citizen)
}

//Write a kotlin function that extracts a substring from a given string stsrting from index
//2 to index 5 using the slice function and returns it.
fun nameString(name:String):String{
    var a= name[2]
    var b= name [3]
    var c= name[4]
    var d= name[5]
    var fullname= a+" "+b+" "+c+" "+d
    return fullname
}

// Write a kotlin function named isEven that takes an integer as a parameter and returns a
//Boolean indicating whether the number is even or odd.
fun isEven(num:Int):Boolean{
    var number=
        if(num==24){
            println("even")
            true
        }else{
            println("odd")
            false
        }
}
// Implement a kotlin function that declares a variable temperature of type Double and assigns it a temperature value
// Then, print a message saying "The temperature is [temperature] degrees Celsius."
fun temperature(num:Double){
    var sentence= "The temperature is $num degrees Celcious"
    println(sentence)
}