package ex20221122

import java.util.Scanner

fun main() {

    // while(조건식) {
    // 조건식이 true일 동안, 실행시킬 코드
    // 단, 조건식은 무조건 결과값으로 true/false를 돌려줘야함
    // 비교연산자, 논리연산자, Boolean(true, false)

    val sc = Scanner(System.`in`)
    print("숫자를 입력하세요 : ")
    var answer = readLine()?.toInt()

    //값을 담아줄 공간
    var i = 1
    if (answer != null) {
        while (answer > 0) {
            i *= answer
            answer--
        }
    }
    println("결과값 : $i ")

}