// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
  ((hours.toLong() * 60 + minutes) * 60 + seconds) * 1000

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}