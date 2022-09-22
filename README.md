<h1 align="center">
  <img src="https://w7.pngwing.com/pngs/917/862/png-transparent-java-programmer-computer-programming-logo-others-miscellaneous-text-logo.png" alt="Logo" width="250">
  <br>
  A repository to learning Java
  <br>
</h1>

<div align="center">

| Java                                                    |
| :------------------------------------------------------ |
| [`Hello World`](#hello-world)                           |
| [`Variables`](#variables)                               |
| [`Math Methods`](#math-methods)                         |
| [`Conditional in variables`](#conditional-in-variables) |
| [`Conditional`](#conditional)                           |

</div>

<br/>

## Hello World

```java
// Remember to put ";"
System.out.println("Hello World);
```

## Variables

```java
// Text
string name = 'Guillermo';

// Number
int age = 19;

// Decimal Number
double money = 200.90;
float coin = 200.90f;

// True or False
boolean female = false;
```

## Math methods

```java
int firstNumber = 20, secondNumber = 50;
int math = firstNumber + secondNumber; // addition
int math = firstNumber - secondNumber; // subtraction
int math = firstNumber * secondNumber; // multiplication
int math = firstNumber / secondNumber; // division
```

## Conditional in variables

```java
int firstNumber = 8, secondNumber = 10, thirdyNumber = 15;

boolean condition = firstNumber > secondNumber; // 8 > 10?
system.debug(condition); // This result is false

boolean otherCondition = firstNumber < secondNumber; // 8 < 10?
system.debug(otherCondition); // This result is true
```

## Conditional

```java
integer price = 0;

if ( price >= 30 && price <= 50 ) { // if price is between 30 and 50
    System.debug('I bought a t-shirts');
} else if ( price > 50 && price <= 80 ) { // if else price is between 51 and 80
    System.debug('I bought two t-shirts');
} else if ( price > 90) { // if else price is more than 90
    System.debug('I ended up leaving');
} else { // if price is less 30
    System.debug('I havent money');
}
```
