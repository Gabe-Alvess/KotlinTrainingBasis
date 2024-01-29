import java.util.Scanner
import kotlin.math.floor
import kotlin.random.Random

fun main() {
    // Functions
    // Possible because they are in the same file
    helloWorld()
    lineFunction()
    println(sum())
    lineFunction()
    println(strConcat())
    lineFunction()
    val value = multiply()
    lineFunction()
    println("value = $value")
    // subtraction() | Outside of main function scope (Only accessible inside multiply function scope)
    lineFunctionStrikeBack()
    ageVerification(15)
    lineFunction()
    multiParams(name = "Joseph", age = 25) // -> Kotlin named args | Can be reordered
    multiParams(18, "Jos") // Unnamed args
    loginVerification(age = 50, name = "Robert", isAdmin = true)
    loginVerification(age = 30, name = "Jen")
    lineFunctionStrikeBack()
    userRegistration("Daniel", 22)
    userRegistration("Gabriel", 23, true)
    userRegistration("Tiago", 30)
    userRegistration("Jefferson", 35)
    lineFunction()
    guessTheRightNumber()
}

// Unit functions (Like Java void functions)
fun helloWorld(): Unit { // --> Unit declaration not necessary
    println("HELLO WORLD! AGAIN AND AGAIN ")
    println("NEEDED TO PREVENT THE PROGRAMING CURSE")
}

fun lineFunction() {
    println("-".repeat(100) + " Hail the line function")
}

// Return functions
fun sum(): Int {
    return 5 + 5
}

fun strConcat(): String {
    return "The sum of 5 + 5 is equal to ${sum()}"
}

// functions inside functions
fun multiply(): Int {
    val result = 5 * 5

    fun subtraction() {
        println("$result - 10 = ${result - 10}")
    }

    subtraction()

    return result
}

// One line function
fun lineFunctionStrikeBack() = println("-".repeat(90))

// Parameterized functions
fun ageVerification(age: Int) = if (age > 18) println("Can drive") else println("cannot drive")

// OR

//fun ageVerification(age: Int) {
//    if(age > 18) {
//        println("Can drive")
//    } else {
//        println("cannot drive")
//    }
//}

// Multiple parameters function
fun multiParams(age: Int, name: String) {
    println("My age is $age and my name is $name")
    if (age > 18) println("Can drive!") else println("Cannot drive!")
}

// Function overloading or method overloading
fun loginVerification(age: Int, name: String, isAdmin: Boolean) {
    println("My name is $name and I'm $age years old. Is admin: ${if (isAdmin) "Yes" else "No"}")
}

fun loginVerification(age: Int, name: String) {
    println("My name is $name and I'm $age years old.")
}

// Adding default params
fun userRegistration(name: String, age: Int, isAdmin: Boolean = false) {
    println("| Name: $name | Age: $age | Admin: $isAdmin |")
}

// Function practice
fun guessTheRightNumber() {
    var guess = 0
    var restart = 0
    var range = 21
    var randomNumber = Random.nextInt(range)
    var currentTrys = 0
    var highScore = 0
    val scanner = Scanner(System.`in`)

    fun calcHighScore() {
        highScore = (10 / currentTrys * 2)
    }

    println("Guess the random number from 0 to ${range - 1}!")
    println("The fewer attempts the better!")

    gameLoop@ while (true) {
        println(randomNumber)
        lineFunctionStrikeBack()
        println("Current trys: $currentTrys                                                      Highscore: $highScore")
        lineFunctionStrikeBack()
        if (restart == 1) println("New range: from 0 to ${range - 1}")

        print("Enter your guess here: ")
        if (scanner.hasNextInt()) {
            guess = scanner.nextInt()
        } else {
            println("Only numbers allowed!")
            scanner.next()
            continue
        }

        if (guess == randomNumber) {
            println("Congratulations you found the right number!\nRight Number: $randomNumber")
            println("Do you want to restart the game and increase difficulty level? 1 (YES) | 2 (NO)")

            while (true) {
                if (scanner.hasNextInt()) {
                    restart = scanner.nextInt()
                } else {
                    println("Only numbers allowed!")
                    scanner.next()
                    continue
                }

                if (restart == 1) {
                    range += 10
                    randomNumber = Random.nextInt(range)
                    calcHighScore()
                    currentTrys = 0
                    continue@gameLoop
                } else if (restart == 2) {
                    break@gameLoop
                } else {
                    println("Enter 1 for (YES) or 2 for (NO)!")
                }
            }

        } else {
            print("Nope! Try again, ")
            if (guess > randomNumber) println("it's a smaller number!") else println("it's a greater number!")
            currentTrys++
        }
    }
}