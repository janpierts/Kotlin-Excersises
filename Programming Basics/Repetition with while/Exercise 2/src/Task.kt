// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var count = 1
  var suma = 0
  while(number>=count){
    suma+=count
    count++
  }
  return suma
}

fun main() {
  println(sum(10))  // 55
}