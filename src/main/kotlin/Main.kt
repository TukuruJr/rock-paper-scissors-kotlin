import java.util.Scanner
import kotlin.random.Random

fun main(args: Array<String>) {
    println("Rock,Paper, Scissors Shoot!!")
    var uMove = getUserMove()
    var cMove = getComputerMove()
    println("you played $uMove and the computer played $cMove")
    println(getWinner(cMove,uMove))

}

//computer's random character
fun getComputerMove():String{
    var move = ""
    val random = Random
    var value = random.nextInt(3)


    when(value){
        0->move="Rock"
        1-> move="Paper"
        2->move="Scissors"
    }
return move
}

//get user move

fun getUserMove():String{
    val scanner = Scanner(System.`in`)
    var move:String = ""

    //display the menu of available
    
    println("select a move: ")
    println("r: Rock")
    println("p: Paper")
    println("s: Scissors")
    var role = scanner.next() //get player move
    when(role){
         "r"->move = "Rock"
         "s"->move = "Scissors"
         "p" -> move="Paper"
    }
    return  move
}

fun getWinner(comp:String, user:String):String{
    if (comp==user){
        return "Tie"
    }
    else if (user == "Rock" && comp == "Scissors") {
        return "You Win!";
    } else if (user == "Scissors" && comp == "Paper") {
        return "You Win!";
    } else if (user == "Paper" && comp == "Rock") {
        return "You Win!";
    } else {
        // if it's not a tie and you didn't win, computer won
        return "Computer Wins!";
    }
}