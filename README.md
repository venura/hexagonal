# hexagonal

Test for the console - see the diagram
A 3 steps init

   - Instantiate the "I need to go out" adaptors
   - Instantiate the Hexagon
   - Instantiate the "I need to enter" adaptors
     

Java code for the example given in the Talk given on Hexagonal architecture by Alistair Cockburn.Pls refer the youtube url given below.

https://www.youtube.com/watch?v=th4AgBcrEHA&list=PLGl1Jc8ErU1w27y8-7Gdcloy1tHO7NriL


![image](https://github.com/venura/hexagonal/assets/4454490/3e1d2e5c-13f2-4097-9ee9-1625cc146f2b)

- With a FIT test harness driving the application and using the mock (in-memory) database substituting for the real database
- Adding a GUI to the application, still running off the mock database
- In integration testing, with automated test scripts (e.g., from Cruise Control) driving the application against a real database containing test data
- In real use, with a person using the application to access a live database.

https://alistair.cockburn.us/hexagonal-architecture/


https://github.com/jmgarridopaz/bluezone
https://www.youtube.com/watch?v=tZzfKCt2Ens
