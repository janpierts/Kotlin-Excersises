// NumberTypes/Task3.kt
package numberTypesExercise3

fun convertFahrenheitToCelsius(f: Int): Double =
  ((f.toDouble()-32.toDouble()).toDouble()*(5.toDouble()/9.toDouble()).toDouble())

fun convertCelsiusToFahrenheit(c: Int): Double =
  c.toDouble()*(9.toDouble()/5.toDouble()).toDouble()+32.toDouble()

fun main() {
  println(convertFahrenheitToCelsius(68)) // 20.0
  println(convertCelsiusToFahrenheit(20)) // 68.0
}