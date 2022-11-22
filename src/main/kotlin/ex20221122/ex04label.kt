package ex20221122

fun main() {

    //label: while문에 이름을 (라벨)부여해서
    //break할때 어떤 while문을 종료시킬껀지 정할 수 있다.
    //continue도 동일하게 어떤 while문을 동작시킬껀지 정할 수 있다.

    outer@while(true){
        println("바깥 while문 작동중")
        inner@while (true){
            println("안쪽while문 작동중")
            //어떤 조건을 만족할 경우 바깥 while문까지 종료
            //기존에 java 2가지 종료조건이 필요
            break@outer
        }
    }

}