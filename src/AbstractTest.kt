abstract class Animal{
    var name: String =""
    abstract fun move()
}
interface iAnimal {
    abstract fun eat()

}
class iTiger : Animal(), iAnimal{
    override fun move(){
        println("네 발로 이동한다.");
    }
    override fun eat(){
        println("호랑이는 민서를 좋아해.");
    }
    fun CatchDear(){
        println("호랑이는 사슴을 잡는다.");
    }
}
class iCat : iAnimal{
    override fun eat(){
        println("고양이는 생선을 좋아해.");
    }
}


fun main(){
    var cat = iCat()
    var tiger = iTiger()
    cat.eat()

    tiger.move()
    cat.eat()
}