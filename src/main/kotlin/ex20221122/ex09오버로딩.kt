package ex20221122

fun main() {

    // 오버로딩(Overloading) : 중복정의
    // 한 클래스 내에서 같은 이름의 메소드를 선언
    // 단, 매개변수의 형태가 달라야 한다 !( 매개변수의 데이터타입, 갯수)
    // 생성자, println문!!

    //미국인( firstName, middleName, LastName)
    //한국인(firstName, LastName)

    setName("스티븐","잡스")
}
//미국인이름 등록하는 setName()만들기

fun setName(firstName:String,middleName:String,lastName:String){
    //스티븐 폴 잡스
}
//한국인 이름 등록하는 setName()만들기 : 매개변수 2
fun setName(fistName:String,lastName:String){
    //유 성용
}