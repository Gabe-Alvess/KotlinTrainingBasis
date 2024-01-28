fun main() {
    // Kotlin's data type declaration
    // In Kotlin data type declaration is not necessary for the most primitive types!!! (It is only necessary in specific situations)
    // It is implicitly declared

    var decimal: Double = 39.90
    var integer: Int = 39

    // Primitive data types: byte, short, int, long, float, double, char, String, boolean. (Same as Java except for String )
    val byte: Byte = 8           // 8-bit
    val short: Short = 16        // 16-bit
    val int: Int = 32            // 32-bit
    val long: Long = 64          // 64-bit
    val float: Float = 39.90f    // 32-bit (floating point)
    val double: Double = 39.90   // 64-bit (floating point)
    val char = 'a'               // 16-bit | Most used for data cryptography
    var name: String = "José"    // A sequence of characters | Used for text
    val boolean = true           // true false | (1 - 0) | 1 bite (8-bit)

    // Primitive types conversion Kotlin
    val value = 22
    val conversionToDouble = value.toDouble()
    val conversionToShort = value.toShort()
    val conversionToString = value.toString()

    println(conversionToDouble)
    println(conversionToShort)
    println(conversionToString)
}