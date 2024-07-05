### PRACTICAL EXERCISE ON EXCEPTION CUSTOMIZED, POJO, AND HOW TO CREATE AN OBJECT IN JAVA
### DESCRIPTION
in these programs we are looking for learning, especially in basic knowledge of java language and how to write a code correctly and always taking into account the book "Clean Code".
Custom error exception in java : this code is about how to create a custom error.
POJO: 
Stands for "Plain Old Java Object" in this code is about how to encapsulate data and has no dependency on frameworks.
How to print an object in java:
The code shows how to print an object by calling the object.
### LENGUAJE USED
JAVA
# How to generate your exception  ?
To generate a custom exception in Java, we must follow the following steps:

#### 1. Create a class for your exception: Define a class that extends Exception (or one of its subclasses such as Exception if you want an unchecked exception). This class will represent your own custom exception.

#### 2. Implement the constructor: In the class of your custom exception, implement constructors that call the constructor of the base class (Exception) using super() and that can accept a message describing the exception.

#### 3. Use your exception in your code: Where you need to throw this exception, instantiate your custom exception class and throw it using throw.
# Practice Example:
* [ExceptionErrorCustom] (name of file in repo)
# Image:
![image](https://github.com/EdisonAuquilla/Practical-exercise-on-Exception-POJO-and-Print-an-Object-in-java/assets/169932459/953b0b51-ef9e-4373-bfd2-6db5e088fc93)
![image](https://github.com/EdisonAuquilla/Practical-exercise-on-Exception-POJO-and-Print-an-Object-in-java/assets/169932459/11c796a6-ca3b-48ba-b5fe-3f913adaf113)


# what is POJO ?
POJO is an acronym for "Plain Old Java Object". This term was coined by Martin Fowler and refers to a programming style used in Java to create simple classes that encapsulate data and do not depend on any specific framework or library.
# Practice Example:
* [POJO] (name of file in repo)
# Image:
![image](https://github.com/EdisonAuquilla/Practical-exercise-on-Exception-POJO-and-Print-an-Object-in-java/assets/169932459/ee4137ea-fa3a-44ec-bc5e-e83faecf2217)


# How to print an object in Java?
In Java, printing an object generally involves displaying a string representation of that object. 
# Practice Example:
* [HowToCreateAnObjectInJava] (name of file in repo)
  # Image:
![image](https://github.com/EdisonAuquilla/Practical-exercise-on-Exception-POJO-and-Print-an-Object-in-java/assets/169932459/cc225e24-a944-42ce-a7f7-88b4e9311c69)


