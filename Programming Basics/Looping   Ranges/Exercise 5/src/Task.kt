// LoopingAndRanges/Task5.kt
package loopingAndRangesExercise5

fun main() {
  val s = "abcd"
  for (index in s.indices) {
    val char = s[index]
    println("$index: $char")
  }
}