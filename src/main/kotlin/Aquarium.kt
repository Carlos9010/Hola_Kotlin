import kotlin.math.PI


open class Aquarium(
    var width: Int=20,
    var height:Int=40,
    var length:Int=100){

    constructor(numberOfFish:Int):this(){
        val water:Int=numberOfFish*2000//cm3
        val tank:Double=water+water*0.1
        height=(tank/(length*width)).toInt()
    }




    open var volume:Int
        get() = width * height * length / 1000
        //var value=666
        set(value) { height = (value * 1000) / (width * length) }

    open var water=volume*0.9

   /* fun volume():Int{
        return width*height*length/1000
    }Esta función se puede escribir también como
     se muestra abajo en una sola línea*/
  // fun volume()=width*height*length/1000
//También se puede escribir así:
 /*   val volume:Int
    get() {
        return width*height*length/1000
    }*/
// Y esto también se puede llevar a una línea.
 /*  var volume:Int
       get() = width * height * length / 1000
       //var value=666
        set(value) { height = (value * 1000) / (width * length) }*/
    //set(value) {width * height}


}


class ToweTank():Aquarium(){

    override var water=volume*0.8

    override var volume:Int
        get() = (width * height * length / 1000* PI).toInt()
        //var value=666
        set(value) {height = (value * 1000) / (width * length) }

}