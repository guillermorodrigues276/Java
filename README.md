<h1 align="center">
  <img src="https://cdn.freebiesupply.com/logos/thumbs/2x/java-14-logo.png" alt="Logo" width="250">
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

## Loops

```Java
// loop with a fixed amount of repetitions
// syntax for loop
for (init_stmt; exit_condition; increment_stmt) {
    code_block
}

for (int i = 0; i < 10; i++) { // one in one
    System.out.println(i);
}

for (int i = 2; i <= 44; i += 2) { // two in two
    System.out.println(i);
}

// for a infinity repetitions
// syntax while loop
while (condition) {
    code_block
}

int z = 0; // declaring variable out of loop
while (z <= 10) { // one in one
    System.out.println(z);
    z++;
}

while (z <= 40) { // four in four
    System.out.println(z);
    z += 4;
}

//syntax do while loop
do {
   code_block
} while (condition);

int x = 0;
do { // one in one
    System.out.println(x);
    x++;
} while (x <= 5);

do { // two in two
    System.out.println(x);
    x += 2;
} while (x <= 12);
```

