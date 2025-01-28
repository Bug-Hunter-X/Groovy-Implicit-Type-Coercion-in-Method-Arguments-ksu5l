```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  } else {
    return str.toUpperCase()
  }
}

assert myMethod(null) == "Null String"
assert myMethod("hello") == "HELLO"

// Unexpected behavior
println myMethod(["a","b"])
```