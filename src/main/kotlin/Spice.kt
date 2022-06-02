class Spice(
    val name: String,
    val spiciness: String="mild" ) {

     val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }



  /* var spices1= listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )*/
  fun makeSalt() = Spice("Salt")

  /*  val spicelist = spices1.filter {it.heat < 5}

    */

}

val spice = Spice("cayenne", spiciness = "spicy")



