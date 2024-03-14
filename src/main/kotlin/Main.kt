fun main() {
  word("karen")
  println("karen")
   studentRecords("karen", 20, "0798989876", 23F, "kenyan")
}
  // Write a function that takes in a String and returns its length (2 points)
  fun word(word:String):Int{
    println(word.length)
    return word.length

  }

 //Write a function that takes in a name and prints out "That's me!" when your name is passed to it, otherwise it prints out "I don't know who that is" (3 points)
  fun nameSentence(name:String){
    if (name=="karen"){
      println("That's me!")
    }else
      println ("I don't know who that is")
  }
// You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number, weight in kg and citizen. For the
//citizen field you will track whether a student is a Kenyan or not.
fun studentRecords(fullName:String, age:Int, phoneNumber:String, weight:Float, citizen:String){
    println(fullName)
    println(age)
    println(phoneNumber)
    println(weight)
    println(citizen)

}