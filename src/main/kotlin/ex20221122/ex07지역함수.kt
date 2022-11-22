package ex20221122

fun main() {
    //add1 (5,6) <<오류남 함수 선언되기전에 있어서
    //지역 함수를 사용할때에는 먼저 선언부가 있어야 한다
    // 지역함수

    fun add1(a:Int,b:Int):Int{
        return a+b
    }

    add1(3,4)
    // 최상위 레벨 함수 (Top-Level)
}//최상위 레벨 함수 (Top-Level-Function)

fun add2(a:Int, b: Int):Int{
    return a+b
}//최상위 레벨 함수 >> 메인 밖에서 만들어서?