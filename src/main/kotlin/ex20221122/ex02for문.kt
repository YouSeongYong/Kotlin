package ex20221122

fun main() {
    // Java
// for( int i = 0; i<3; i++){
//       println(i)
// }

// Kotlin
// for( i in 1..2 ) {
//       println(i)
// }

    // 1-10

    for (i in 1..10){
        println(i)
    //1,2,3,4,5,6,7,8,9,10
    }

    //for문도 한줄인거에 대해서 중괄호 생략가능
    for (i in 1..9 step 2) println(i)
    //1,3,5,7,9

    for (i in 10 downTo 1){
        println(i)
        //10,9,8,7,6,5,4,3,
    }
    for (i in 10 downTo 2 step 2){
        println(i)
        //10,9,8,7,6,5,4,3,
    }
}