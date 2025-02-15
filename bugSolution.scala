```scala
class MyClass(val x: Int) {
  def myMethod(): Int = {
    if (x > 10) {
      x + 1 
    } else if (x < 0) {
      x - 1 
    } else {
      x
    }
  }
}
```