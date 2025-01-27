# Groovy Dynamic Typing Bug

This repository demonstrates a common issue in Groovy related to its dynamic typing system.  When performing operations on variables without explicit type checking, unexpected `MissingMethodException` errors can occur when the types are not compatible.

The example uses a simple method that adds two numbers. However, if you provide a string as input, it will throw an error because Groovy's implicit type conversion does not handle this scenario.

The solution involves explicitly checking or converting variable types to handle potential mismatches and prevent unexpected errors.
