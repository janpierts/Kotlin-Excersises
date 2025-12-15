// Booleans/Task2.kt
package booleansExercise2

fun showAnd(first: Boolean, second: Boolean) {
  val result = first && second
  println("$first && $second == $result")

}

fun showOr(first: Boolean, second: Boolean) {
  val result = first || second
  println("$first || $second == $result")
}

fun showTruthTable() {
  val values = arrayOf(true, false)

  println("Truth Table for AND (&&):")
  for (first in values) {
    for (second in values) {
      showAnd(first, second)
    }
  }

  println()

  println("Truth Table for OR (||):")
  for (first in values) {
    for (second in values) {
      showOr(first, second)
    }
  }
}

fun main() {
  showTruthTable()
}