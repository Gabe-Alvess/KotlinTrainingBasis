fun main() {
    // CONDITIONS

    val product = "iPhone"
    val price = 30_000

    // If and else
    // Condition needs to be boolean expression
    // Operators: (<, <=, >, >=, !, ==, !=, ?:)

    if (product.length < 3) {
        println("You can't add products with small names")
    } else {
        println("Product successfully added")
    }

    if (price > 30_000) {
        println("You won 30% discount")
    } else if (price > 20_000) {
        println("You won 20% discount")
    } else if(price > 10_000) {
        println("You won 10% discount")
    } else {
        println("You didn't win a discount")
    }

    // Kotlin recommended way for writing if else

    val age = 60

    if (age > 100) println("More than 100 years old")
    else if(age > 50) println("More than 50 years old")
    else println("Less than 40 years old")


    val productPrice = 49
    val newProduct = "Keyboard"

    // AND Expression
    // TRUE | TRUE = true
    // TRUE | FALSE = false
    // FALSE | TRUE = false
    // FALSE | FALSE = false

    if (productPrice == 49 && newProduct == "Keyboard") println("Success")
    else println("Fail")

    // OR Expression
    // TRUE | TRUE = true
    // TRUE | FALSE = true
    // FALSE | TRUE = true
    // FALSE | FALSE = false

    if (productPrice == 49 || newProduct == "Keyboard") println("Success")
    else println("Error")

    // OR expressions never verify the second condition if the first condition is true!!!!
    // Example:

    val a = 10 // If 'a' is 10 no error occurs
    val b = 0

    if (a == 10 || 10 / b == 1) println("Success")
    else println("Error")

    // String comparison
    val product1 = "pc"
    val product2 = "pc"

    println(product1 == product2)
    println(product1 != product2)

    // Kotlin doesn't permit any null variable unless specified
    // Non-nullable variable example
    var car: String = "nissan"
    // car = null -> Error

    // Nullable variable example
    var address: String? = "Street A"
    address = null

    // Check is needed when using methods in a nullable variable
    var totalChars = address?.length // Like in typescript
    println(totalChars)

    // Elvis operator = ?: 🤦🏻‍♂️🤦🏻‍♂️🤦🏻‍♂️
    totalChars = address?.length ?: 0

    // Same as the following
    totalChars = if (address != null) address.length else 0
}