// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

import varargs.sum

fun sumOfEven(n: Int): Int {
  var count = 0
  var suma = 0
  while(n>=count){
    if( count %2 == 0) suma+=count
    count++
  }
  return suma
}

fun main() {
  println(sumOfEven(10))  // 30
}