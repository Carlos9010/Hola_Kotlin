import java.lang.Math.random
import java.util.*
import java.util.Random
import kotlin.math.roundToInt
import kotlin.math.withSign


/*fun main (args: Array<String>){
    println("Hola Chicho ${args[0]}")
    // feedTheFish()````}}`
    println("-------")
    //println(rollDice1())
    gamePlay(rollDice0(4))
    /*val random1 = random()
    println(random1)
    val random2 = {random()}
    println(random2())*/
   // maine()
   //eagerExample()
   // especias()
    // isMoodWeather("happy", "Sunny")
    println("-------")
  /*  repeat(2){
        println("Chicho\n")
    }*/
 //   println("-------")
 //   swin(1,"Guro")
 //   println("-------")
//    dayOfWeek()
 //   println("-------")
 //   hourOfDay()
 //   println("-------")
   // println("Su fortuna1 es: ${getFortuneCookie()}")
 //   println("-------")
  //  fortuna()
 //   swin(20,"Guro")
 //   println("-------")
//println(canAddFish(10.0, listOf(3,3,3)))
//println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
 //   println("-------")
  //  println(shouldChangeWater("Sunday"))
  //  println("-------")
   // shouldChangeWater("Sunday")
   // por()
   // println(birthday)
}*/

val rollDice1 = { Random().nextInt(12)+1}

//Esta variable toma un argumento que indica
// el número de lados utilizados para una tirada de dados.
val rollDice2 = { sides: Int ->
    Random().nextInt(sides) + 1
}
//Si el número de lados es 0 se devuelve 0.
val rollDice0 = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

val rollDice4: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}


fun gamePlay(diceRoll: Int){
    // do something with the dice roll
    println(diceRoll)
}

val u= 1..12
val rollDice={ println(u.random())}


fun whatShouldIDoToday(
    mood:String,
    weather:String="sunny",
    temperature:Int=24): String{

//2da forma de usar el when
    return when {
 isMoodAndWeather(mood,weather) -> "go for a walk"
 isMoodAndWeatherAndTemperature(mood,weather,temperature) -> "stay in bed"
 isTemperature(temperature) -> "go swimming"
  else -> "Stay home and read."
    }
//1ra forma de usar el when
  /*  return when {
 mood == "happy" && weather == "Sunny" -> "go for a walk"
 mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
 temperature > 35 -> "go swimming"
    else -> "Stay home and read."
}*/
}

/*fun isMoodWeather(
    mood: String,
    weather: String){
   if (mood == "happy" && weather == "Sunny"){
   println("go for a walk")}
}*/
fun eagerExample(){
    val fortunes=listOf("great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.","Take it easy", " Es buena", "Puede ser mejor",
        "No lo es todo","Estás cerca")
   // val eager=fortunes.filter { it[0]=='T' }
   // println(eager)

    val lazyMap=fortunes.asSequence().map {
        //println("map: $it")
        it
    }
    //println("Yo $lazyMap" )
    println("first: ${lazyMap.first()}")
    println("All: ${lazyMap.toList()}")
}

fun especias(){
    val spices = listOf("green curry","curry", "pepper", "cayenne",
        "ginger", "red curry", "red pepper","curry 1" )

println(spices.filter { it.contains("curry")})
println(spices.filter { it.contains("curry")}.sortedBy { it.length })
println(spices.filter{it.startsWith('c')}.filter{it.endsWith('e')})
println(spices.filter{it.startsWith('c') && it.endsWith('e') })
println(spices.take(3).filter{it.startsWith('c')})
    //println(eage)
    //println(spices)

    val lazyMap=spices.asSequence().map {
       // println("map: $it")
        it
    }


    //println("All: ${lazyMap.toList().filter {it == "curry" }}")
    //println("All: ${lazyMap.toList()}")

    /*val eage=spices.filter { it == "curry" }
    println(eage)*/
   //  val eager=spices.filter { v-> v=="curry" }
    //println(eager)
    // println("first: ${lazyMap.filter { v-> v=="curry"}}")
   // println("first: ${lazyMap.first()}")
   // println("Todos los curry: ${lazyMap.toList().equals("curry")}")
    //val a=spices.filter { "curry" }
   // val a=spices.filterIndexed("curry")

}

fun maine() {
//sampleStart
    val numbers = listOf(" curry one" , " two curry" ,
        " three" , " four", "curry" )
    println(numbers.filter {it.contains("curry")  })

    val lazyMap=numbers.asSequence().map {
        // println("map: $it")
        it
    }
   //  println(lazyMap.associateWith {  v-> v=="curry" })
    println(numbers. any { it. endsWith(" e" ) })
    println(numbers. none { it. endsWith(" a" ) })
    println(numbers. all { it. endsWith(" e" ) })
    println(emptyList<Int>() . all { it > 5 }) // vacuous truth
//sampleEnd
}


fun isMoodAndWeather(
    mood: String,
    weather: String):Boolean= mood=="happy" && weather=="Sunny"

fun isMoodAndWeatherAndTemperature(
 mood: String,
 weather: String,
 temperature: Int):Boolean=mood == "sad" && weather == "rainy" && temperature == 0

fun isTemperature(temperature: Int):Boolean=temperature > 35

    fun canAddFish(
            tankSize: Double,
            currentFish: List<Int>,
            fishSize: Int=2,
            hasDecorations:Boolean=true):Boolean{
  println(currentFish.sum()+fishSize)
return (tankSize * if(hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)

        /* for (element in currentFish) {
             println(element)
         }*/

    }


    fun shouldChangeWater(
        day: String,
        temperature: Int=22,
        dirty:Int=20 ):Boolean{

        val isTooHot=temperature>30
        val isDirty=dirty>30
        val isSunday=day=="Sunday"
      //  println("Hey $isTooHot")

//Tercera forma de usar este when
        return when{
            isTooHot(temperature)->true
            isDirty(dirty)->true
            isSunday(day)->true
            else->false
        }

        //Segunda forma de usar este when
     /*  return when{
            isTooHot->true
            isDirty->true
            isSunday->true
            else->false
        }*/

        //Primera forma de usar este when
  /*  return when{
        temperature>30->true
        dirty>30->true
        day=="Sunday"->true
        else->false
    }*/

    }

fun isTooHot(temperature: Int):Boolean=temperature>30
fun isDirty(dirty: Int):Boolean=dirty>30
fun isSunday(day: String):Boolean=day=="Sunday"



/*fun feedTheFish(){
    val day=randomDay()
    //val day =" Tuesday"
    // val food="pellats"
    val food=fishFood(day)
    println("Today is $day and the fish eat $food")
    if (shouldChangeWater(day)){
        println("Cambie el agua hoy")

    }
}*/

    fun swin( time: Int, speed: String="fast"){
        println("swimmin $speed")

    }
fun getFortuneCookie():String{
    val fortunes=listOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.",
       "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.","Take it easy", " Es buena", "Puede ser mejor",
        "No lo es todo","Estás cerca")
    println("Enter your birthday:")
    val birthday= readLine()?.toIntOrNull()
    //val o= birthday?.div(a.count())
    //Esta línea de abajo fue propuesta en la solución del curso
    val o= birthday?.rem(fortunes.size)
    println("a.count() es: ${fortunes.count()}")
    println("a.size es: ${fortunes.size}")


  /*  for ((index,element)in fortunes.withIndex()){
        if (element == "Take it easy"){
            println("Se seleccionó a Take it easy en el índice $index ")
        }
    }*/
   /* for (element in a ){
        if (element == "Take it easy"){
            println("Se seleccionó a Take it easy en la posición ${a.get(element[])} ")
        }
    }*/
    //println(a.count())
    //println(o)
    return fortunes[o!!]
   }

    fun fortuna(){
      //var fortune: String
     /* for (i in 1..10) {
         // fortune=
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        println("Esta es la $i vuelta del for")
        if (fortune.contains("Take it easy")) break
      /* if (fortune.contains("Take it easy")){
            println("Se encontró en la posición $i")
        } ;break*/

       }*/
       println( when(getBirthday()){
            in 0..20->"Pequeña fortuna"
            in 20..30->"Fortuna creciente"
            else->getFortuneCookie()
        })

    }


fun getBirthday(): Int? {
    println("Enter your birthday:")
    return readLine()?.toIntOrNull()
}

 /* var fortune: String
   for (i in 1..10) {
      fortune = getFortune(getBirthday())
      println("\nYour fortune is: $fortune")
      if (fortune.contains("Take it easy")) break;
   }*/

//Esta función recorre una lista elemento por elemento
// que contiene la lista.
fun por(){
    for (element in getFortuneCookie() ){
        if (element.equals("Take it easy")){
            println("Se seleccionó a Take it easy en la posición $element ")
        }
    }
}




fun randomDay():String{
    val week= listOf("Monday","Tuesday", "Wednesday", "Thursday", "Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
    }

fun fishFood(day :String):String{
    //var food="fasting"
    return when (day){
        "Monday"->"flakes"
        "Tuesday"->"pellets"
        "Wednesday"->"redworms"
        "Thursday"->"granules"
        "Friday"->"mosquitoes"
        "Saturday"->"lettuce"
        "Sunday"->"plankton"
        else ->"fasting"
    }
}

fun hourOfDay(){
val e= Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
if (e<12)println("Good morning, Kotlin")else println("Good night, Kotlin")
}



//Esta función muestra el día que es hoy se guía por el día del sistema operativo de la computadora
fun dayOfWeek(){
    println("What day is it today?")
    val g=Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    //println(g)
   println( when (g) {
        1->"Hoy es Domingo"
        2->"Hoy es Lunes"
        3->"Hoy es Martes"
        4->"Hoy es Miercoles"
        5->"Hoy es Jueves"
        6->"Hoy es Viernes"
        7->"Hoy es Sábado"
       else->"Ningún día es"
    })
}
/*if (args[0].toInt() < 12) println("Good morning, Kotlin")
else println("Good night, Kotlin" )*/
/*println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")*/

