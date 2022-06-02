
fun main (args: Array<String>){
 // println("Hola Chicho ${args[0]}")


//cambioDeVariables()
 //   println("-----------------")
    //fish.fishExample()

//buildAquarium()
//    println("-----------------")
//println("Volume: ${myAquarium.volume} liters ")
  //  println(myAquarium.height)
//    println("-----------------")
//println("${simpleSpice.name} ${simpleSpice.heat}")
 //   println("-----------------")
   // println(spic.spicelist)
    //println(spic.heat)
    //println(spic.spices1)
  //  val spicelist = spices1.filter {it.heat < 5}
  /*  spicelist.forEach {
        println(it.name)
    }*/

   // println(spic.makeSalt().name)
  /*  println(bo.currentPage)
    bo.readPage()
    println(bo.currentPage)
    bo.readPage()
    println(bo.currentPage)
    bo.readPage()*/
    //println(spicelist.forEach())
   // makeFish()
  /*  val shark=Shark()
    feedFish(shark)*/
//println(suma(52,35).toString())
   // suma(52, la(12, 5))

   println(feedFish(20))
    println(waterfilter(120))
    println(updatedirty(50,waterfilter))
    println(updatedirty(40,::feedFish))



}

//---------------------------------------------
//Funciones Lambda
//val swim={println("Hello")}
//val waterfilter={dirty:Int -> dirty/2}
//fun compare(a: String, b: String): Boolean = a.length < b.length
//Así se llaman
/*println(compare("lilo", "ne"))
println(waterfilter(20))
swim()*/
fun feedFish(dirty:Int)=dirty+10

val waterfilter:(Int)-> Int={dirty-> dirty+2}

fun updatedirty(dirty: Int, operation:(Int)->Int):Int{
    return operation(dirty)
}
var dirty=20
fun dirtyprocessor(){
    dirty=updatedirty(dirty,waterfilter)
}
//---------------------------------------------------


/*
val la ={ es: Int, otro: Int -> es+otro }

fun suma (uno: Int, dos:Int){
    val su=uno+dos
    println(su)
}

*/


//---------------------------------------------------
//Este código crea y recorre una lista y devuelve la
// palabra que inicie con la letra p.
/*val decoration = listOf<String>("rock","pagola",
    "plastic plant","alligator","flowerpot")
val firtered=decoration.asSequence().filter { it [0]=='p'}
println(firtered.toList())*/
//---------------------------------------------------

/*
fun delegate(){
    val pleco=Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}



/*fun feedFish(fish:FishAction){
fish.eat()
}*/

fun makeFish(){
    val shark=Shark()
    val pleco=Plecostomus()

println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}


//val bo=eBook()
val book=Book("Vinte", "Cuco")



var spices1= listOf(
    Spice("curry", "mild"),
    Spice("pepper", "medium"),
    Spice("cayenne", "spicy"),
    Spice("ginger", "mild"),
    Spice("red curry", "medium"),
    Spice("green curry", "mild"),
    Spice("hot pepper", "extremely spicy")
)



val spic=Spice("mio")



val fish=Fish(true,20)

val simpleSpice = SimpleSpice()


val myAquarium=Aquarium()

fun buildAquarium(){
    println("Length: ${myAquarium.length}\n"
            +"Width: ${myAquarium.width}\n"
            +"Height: ${myAquarium.height}")

 println("Volume: ${myAquarium.volume} liters ")

    val smallAquarium=Aquarium(15,30,20)


    println("Small Aquarium: ${smallAquarium.volume} liters")
    println("Small Water: ${smallAquarium.water} water")

    val myAquarium2=Aquarium(numberOfFish = 9)

  println("Small Aquarium 2: ${myAquarium2.volume} liters with" +
            " length ${myAquarium2.length} " +
          "width ${myAquarium2.width} " +
          "height ${myAquarium2.height} ")



    }

fun cambioDeVariables(){
    myAquarium.height=80
    println("Height: ${myAquarium.height} cm")
}
*/
