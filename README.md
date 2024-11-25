In Tidely Coupling
==================
-> Car is extending Engine class.

-> Car class can't use inheritance in future.

-> Any changes in Engine class will effect on Car class.

-> Car is tightly coupled with Engine.

Note: It is not recommended to develop classes with Tightly coupling.

-> Car is directly creating Object for Engine.

-> Any changes to Engine class will effect on Car class.

-> Car is always talking to only one Engine.

-> If i want to change from one Engine to another Engine then we should modify Car class code.

Note: Car is tightly coupled with Engine.

What is Dependency Injection?
------------------------------

The process of injecting dependent object into target object using target class variable  / setter method / constructor is called as Dependency Injection.
Dependency Injection Types

1) Field Injection (variable)
2) Setter Injection (setter method)
3) Constructor Injection (constructor)

Losely coupling eaxmple 
======================
![image](https://github.com/user-attachments/assets/4c24db44-1f4b-477a-99a7-30f2fbc7fc2b)

