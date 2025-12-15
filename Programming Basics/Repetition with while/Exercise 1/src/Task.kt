// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(s: String) {
    var size : Int = s.length
    var count = 0
    while (size>(count)){
        print("${s[count]}\n")
        count += 1
    }
}

fun main() {
  displayContent("abc")
}
/* Expected output:
a
b
c
*/