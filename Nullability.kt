fun main(args: Array<String>) {
    
    var name : String = "Johnny B"
    //name = null
    
    var nullable : String? = "Do I exist"
    nullable = null
    
    //Null check
    var length = 0
    if(nullable != null){
        length = nullable.length
    } else {
        length = -1
    }
    println(length)
    
    // null check
    
    val l = if (nullable != null) nullable.length else -1
    
    // second method Safe Call Operator
    
    println(nullable?.length)
    
    // Third Method Elvis Operator
    
    val len = nullable?.length ?: -1
    val noName = nullable ?: "No one knowsme"
    
    print(noName)
    
    
}