
////wap to print the solid rectangle
//fun main(){
//    println("Enter the size of the solid rectangle : ")
//    val n= readln().toInt()
//    for (i in 1..n){
//        for(j in 1..n) print(" * ")
//        println()
//    }
//}

////wap to print the hollow rectangle
//fun main(){
//    println("Enter the size of hollow rectangle: ")
//    val n= readln().toInt()
//    for(i in 1..n){
//        for(j in 1..n){
//            if (i==1 ||i==n||j==1||j==n)print(" * ")
//            else print("   ")
//        }
//        println()
//    }
//
//}

////wap to print half pyramid
//fun main() {
//    println("Enter size of half pyramid: ")
//    val n = readln().toInt()
//    for (i in 1..n) {
//        for (j in 1..i) print(" * ")
//        println()
//    }
//
//}

//wap to print the inverted half pyramid
fun main() {
    println("Enter the Size: ")
    val n = readln().toInt()
    var i = n
    while (i >= 1) {
        for (j in 1..i) print(" * ")
        println()
        i--
    }

}