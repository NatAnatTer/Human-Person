val scan = java.util.Scanner(System.`in`)
fun main() {
  println("Введите количество человек или введите end для выхода")
   while (true) {

        val numberOfPeople = scan.nextLine()
        if (numberOfPeople.equals("end")) {
            break
        } else {
            val likes: Int = numberOfPeople.toInt()
            if (likes%10 == 1 && likes%100 !=11) {
                println("Понравилось $likes человеку")
            } else {
                println("Понравилось $likes людям")
            }
        }
        println("Введите количество человек или введите end для выхода")
    }
}





