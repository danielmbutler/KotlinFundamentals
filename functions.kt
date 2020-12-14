fun main(args: Array<String>) {
    
    fun forceChoke() {
        println("you have failed me for the last time Admiral")
    }
    forceChoke()
    
    fun makeAnEntrance(line: String) {
        println(line)
        
    }
    
    makeAnEntrance("I find your lack of faith disturbing")
    
    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int) : Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }
    
    val rebels = calculateNumberGoodGuys(5,7)
    println("Darth Vader faced off againsts $rebels rebel scum")
    println("Darth Vader faced off againsts ${calculateNumberGoodGuys(5,7)} rebel scum")
    
    fun vaderIsFeeling(mood: String ="angry"){
        if (mood == "angry"){
            println("run for the hills Vader is $mood")
        } else {
            println("whatever you do dont make him angry")
        }
    }
    vaderIsFeeling("happy")
}