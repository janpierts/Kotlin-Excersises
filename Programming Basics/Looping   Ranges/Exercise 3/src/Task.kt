// LoopingAndRanges/Task3.kt
package loopingAndRangesExercise3

fun sumOfEven(n: Int): Int {
  var dato = 0
  for(i in 1..n){
    dato+=if(i%2==0)i else 0
  }
  return dato
}

fun main() {
  println(sumOfEven(10))  // 30
}