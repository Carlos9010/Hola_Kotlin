

/*fun main.kt(args: Array<String>) {
    println("\nYour fortune is: ${getFortuneCookie()}")
}*/

/*fun getFortuneCookiet() : String {
    val fortunes = listOf( "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")
    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}*/

//Práctica extra
//Este
/*fun main.kt(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        //fortune = getFortuneCookiet()
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}*/

//Código solución de la lección 3 clase 9
/*fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends, because they are your greatest fortune.")
    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}*/

//Código dado por Google de la Lección 3, clase 13
/*fun main.kt(args: Array<String>) {
   println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(
mood: String,
 weather: String = "sunny",
  temperature: Int = 24) : String {
   return when {
      mood == "happy" && weather == "Sunny" -> "go for a walk"
      else -> "Stay home and read."
   }
}*/

/*Challenge
fun main.kt(args: Array<String>) {
   println(whatShouldIDoToday("happy", "sunny"))
   println(whatShouldIDoToday("sad"))
   print("How do you feel?")
   println(whatShouldIDoToday(readLine()!!))
}

fun isVeryHot (temperature: Int) = temperature > 35
fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
   return when {
      isVeryHot(temperature) -> "go swimming"
      isSadRainyCold(mood, weather, temperature) -> "stay in bed"
      isHappySunny(mood, weather) -> "go for a walk"
      else -> "Stay home and read."
   }
}*/

/*Loops
Using repeat:

fun main.kt(args: Array<String>) {
   var fortune: String = ""
   repeat (10) {
       fortune = getFortune(getBirthday())
      println("\nYour fortune is: $fortune")
      if (fortune.contains("Take it easy")) break;
   }
}*/

/*Using a while loop:

fun main.kt(args: Array<String>) {
   var fortune: String = ""
   while (!fortune.contains("Take it easy")) {
       fortune = getFortune(getBirthday())
      println("\nYour fortune is: $fortune")
   }
}*/