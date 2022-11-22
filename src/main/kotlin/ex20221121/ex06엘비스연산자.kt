package ex20221121

fun main() {

    //엘비스 연산자 (?:)
    //NPE 발생을 예방할 수 있도록 Null 값을 처리해주는 연산자
    var str :String?=null


    //서버에 값받아 올때 많이 사용할거임
    print(str?.length?:"null입니다")
    var result=str?.length ?:-1
}