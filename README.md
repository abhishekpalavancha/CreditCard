# creditCardProcesing
This is a simple Application for Basic Credit Card Processing. 


## Design Approach
This application can be built in any language,but I choose to use JAVA for the application.<br>This application is designed as a Mirco service with Mvc patter.<br>
We have the main controller called the orchestrator who will be the single point of all incoming request.<br> The orchestrator will read the request and call the appropriate service/methods.<br>
This makes the architecture very robust,easily scalable and service independent.<br>
This application can accept input from command line or stdin and process the request accordingly.

## Language 
This application is written in Java with Maven. <br> 
Test cases are written using TestNG.

## Important Notes
Since this was a test and no database is used,I have used different data structures to demonstrate my skills as well as to accomplish the task.</br>
Please make sure the input.txt file is copied to Target folder.<br>

## Assumptions 
Since the assumption given was that all input would be valid, I have implemented minimal checks.<br>
All the methods have automated test cases to check for correctness

## How to build the Application
#### Using eclipse 
This is a maven structured application. <br>
You can easily import it in eclipse by importing this application as an existing maven project.<br>
Once the application has been imported,you can do a:<br>
RUN AS - > Maven install and then RUN AS -> Java Application 
or <br>
DEBUG AS - >  DEBUG install and then DEBUG AS -> Java Application

#### Using CMD 
Please note since we are building a maven project javac wont work . 
Please use this approach to run the code 
<br>
make sure you navigate to project path, for eg:<br>
**C:\Users\Dhaval\eclipse-workspace\CreditCardPrototype\target**

Once in the target folder you can run it like this<br>
**java -jar CreditCardPrototype-0.0.1-SNAPSHOT.jar Add Tom 4111111111111111 $1000 Add Lisa 5454545454545454 $3000 Add Quincy 1234567890123456 $2000 Charge Tom $500 Charge Tom $800 Charge Lisa $7 Credit Lisa $100 Credit Quincy $200 **
<br>
or <br>
**java -jar CreditCardPrototype-0.0.1-SNAPSHOT.jar input.txt **

```
ps: please make sure you have copied the input.txt in the target folder.
```

#### Using Console
#######You can pass the input either filename or commands and then press enter for the input to be accepted
Once the application has been imported , you can either:<br>
RUN AS - > Maven install and then RUN AS -> Java Application 
or <br>
DEBUG AS - >  DEBUG install and then DEBUG AS -> Java Application
and then pass the input param in the console window. 

```
PS:Please press Enter after the input is typed .
```

## Input and Result 

Given the following input:

```
Add Tom 4111111111111111 $1000
Add Lisa 5454545454545454 $3000
Add Quincy 1234567890123456 $2000
Charge Tom $500
Charge Tom $800
Charge Lisa $7
Credit Lisa $100
Credit Quincy $200
```

This program will produce the following output:

```
Lisa: $-93
Quincy: error
Tom: $500
```




