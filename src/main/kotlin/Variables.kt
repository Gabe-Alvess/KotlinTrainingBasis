fun main() {
    // New terminologies: fun, var, val
    // fun = function
    // var = mutable variable (Like in JavaScript)
    // val = immutable variable (Like a final variable in Java or a const variable in JavaScript)

    var product = "Mouse"
    product = "keyboard" // Mutable variable = var

    println(product)

    val pi = "3.14" // Immutable variable = val
//    pi = "5" Can't be changed. Compilation error!
    val age = 23
    val price = 69.50

    println(pi)
    println(age)
    println(price)
}