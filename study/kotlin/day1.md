### 변수

- var : 변경 가능한 변수를 선언하는 키워드
- val : final 변수를 선언하는 키워드 (선언시에만 초기화 가능함)

```kotlin
fun main() {
    var a: Int // 자료형 선언시 -> 변수 : type으로 지정한다.
    a = 123
    print(a)
}
```

```kotlin
fun main() {
    val b: Int = 123
    b = 3 // 중간에 값을 변경하지 못하기 때문에 error가 발생한다.
    print(b)
}
```

- '?'는 변수의 값이 null일 수 있다는 것을 표시한다.(?를 표시하지 않으면 선언시 null이 될 수 없다)

```kotlin
fun main() {
    var a: Int? = null
    print(a)
}
```

### 형 변환 (typecasting)

- 코틀린에서는 to변수()를 통해 형변환 할 수 있다.

```kotlin
fun main() {
    var a: Int = 123
    var b: String = a.toString()
    print(b)
} 
```

### 배열

```
fun main(){
    var intArr1:Array<Int> = arrayOf(1,2,3,4)
    var intArr2: arrayOfNulls<Int>(5)
    
    var anyArr : Array<Any> arrayOf(1,"abcd",3.2,4)
    
    print(intArr1[0])
    print(intArr2[1])
    print(anyArr[1])
}
```

### 함수

- 기본형 함수

```kotlin
fun main() {
    print(add(1, 2, 3))
}

// 함수의 기본형 fun함수이름(매개변수:type):리턴타입
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}
```

- 단일표현식 함수

```kotlin
fun main() {
    print(add(1, 2, 3))
}

// int a,b,c를 더하므로 반환형 타입이 int로 추론할 수 있다
fun add(a: Int, b: Int, c: Int) = a + b + c

```

조건문

```kotlin
fun main() {
    var a = 7
    if (a > 6) {
        println(a)
    } else {
        print("exit")
    }
}

출력 : 7
```

