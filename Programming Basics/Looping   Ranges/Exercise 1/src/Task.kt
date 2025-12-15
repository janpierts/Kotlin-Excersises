// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var dato : Long = 1L
  for(i in 1 .. n){
    dato*=i
  }
  return dato
}

fun main() {
  println(factorial(10))  // 3628800
}