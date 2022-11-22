package ex20221121


import java.lang.NumberFormatException
import java.util.Scanner
import kotlin.random.nextInt

fun main() {

    //랜덤한 수를 가져올수 있는 기능
    val rd=kotlin.random.Random
    //입력하는 도구 가져오기
    val sc=Scanner(System.`in`)

    //1.랜덤한 두수 생성
    var num1=rd.nextInt(10)+1
    var num2=rd.nextInt(10)+1
    //2. 랜덤한 두 수를 출력하자
    println("$num1 + $num2 = ?")
    //Kotlin에서는 같은자료형이랑 만 연산이 가능하다

    //3. 사용자로 부터 정답입력받기
//    val answer= readLine()?.toInt() ?: 0
    //readLine () : String?

    //readLine을 사용하게되면 사용자는 아무 문자/숫자가 입력가능한 상태
    //toInt ---> "1234" 사용자가 무조건 숫자를 입력해야 형변환 가능

    try{
        val answer= readLine()?.toInt()
        //4.사용자가 입력한 정답 == num1+num2값 비교
        val result = if(num1+num2==answer)"정답입니다" else "오답입니다"
        println("결과 : $result")
    }catch(e: NumberFormatException){
        println("숫자를 입력해주세요! 문자는 입력할 수 없습니다.")
    }

    //Exception 잡는 방법
    //try catch --->예외상황
}