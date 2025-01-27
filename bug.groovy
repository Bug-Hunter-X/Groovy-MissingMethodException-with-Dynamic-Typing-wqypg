```groovy
class MyClass {
    def myMethod(a, b) {
        return a + b
    }
}

//This code will work fine if you call myMethod with two numbers
println new MyClass().myMethod(1,2) //Output: 3

//But this code will throw an exception if you call it with a string
println new MyClass().myMethod(1, "2") // Exception: groovy.lang.MissingMethodException
```