fun main() {
    // Text formatting

    // 1. Using especial characters
    val message = "Hello Tiago.\nYour product was delivered!"
    println(message)

    // 2. Using triple quotes
    val welcome = """
        Hello sir.
        Your product was delivered!
    """.trimIndent()
    println(welcome)

    val csv = """
        Text1
        Text2
    """.replaceIndent(";")
    println(csv)

    // 3. Concatenation
    val studentName = "Gabriel"
    val studentAge = 23
    val newPrice = 19.50

    println("Hello, " + studentName + ". Your age is " + studentAge + ". Your new purchase price is: " + newPrice) // Usual annoying concatenation
    println("Hello, $studentName. Your age is $studentAge. Your new purchase price is: $newPrice") // Kotlin template concatenation
    println("""
        
        Hello, $studentName.
        Your age is ${studentAge + 10}. 
        Your new purchase price is: ${newPrice - 10}. 
        Your name has ${studentName.length} characters!
    """.trimIndent())  // Inline expressions possibilities
}