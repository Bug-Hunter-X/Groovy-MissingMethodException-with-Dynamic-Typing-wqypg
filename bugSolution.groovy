```groovy
class MyClass {
    def myMethod(a, b) {
        if (a instanceof Integer && b instanceof Integer) {
            return a + b
        } else if (a instanceof String && b instanceof String) {
            return a + b
        } else if (a instanceof Integer && b instanceof String) {
            return a + Integer.parseInt(b)
        } else if (a instanceof String && b instanceof Integer) {
            return Integer.parseInt(a) + b
        } else {
            throw new IllegalArgumentException("Unsupported types for addition.")
        }
    }
}

println new MyClass().myMethod(1, 2) // Output: 3
println new MyClass().myMethod(1, "2") // Output: 3
println new MyClass().myMethod("1", "2") // Output: 12
println new MyClass().myMethod("abc", 1) //Exception: java.lang.NumberFormatException
```