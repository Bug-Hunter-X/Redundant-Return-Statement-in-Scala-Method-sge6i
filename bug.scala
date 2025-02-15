```scala
class MyClass(val x: Int) {
  def myMethod(): Int = {
    if (x > 10) {
      x + 1 // Correct behavior
    } else if (x < 0) {
      x -1 // Correct behavior
    } else {
      x // Correct behavior
      return x // Redundant return statement: causes compilation error in some contexts
    }
  }
}
```