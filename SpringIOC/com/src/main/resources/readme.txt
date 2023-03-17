Refer video: https://www.youtube.com/watch?v=xYgQfey1p0Y




> Todays session is on Spring Core concepts:
 As we know Spring framework is a open source application framework that provides infrastructure support for developing java application.

 

> There are many Spring modues and Spring Core is one of the module

Again Sprig Core module has 4 modules 

1>Spring Core
2> Spring Beans
3> Spring  Context
4> Spring SpEL (Spring expression language)

Sprin Core and Sprin beans provides IOC and dependency injection support so its called spring core module

Spring Context inherits many features of Spring Beans like factory design pattern and add more features like internationalization, event propogation
resurce loading,also adds features like how to add context to servlet and also provides JEE features like EJB, JMS and basic remoting.


Spring IOC Container:

Spring framework provides a container called IOC container to create objects and hold objects in memory and also helps in injecting one object 
into other object which is called dependency injection.

To perform above functions by IOC Container, we need to provide some info to IOC Container
1>Information about the beans/pojo classes which it has to manage
2>Information about the bean configuration where info on which bean is dependent on which bean is provided.

Based on the configuration provided in configuration file IOC container will perform dependency injection.


Once objects are created and injected based on configuration file in our application code we can get those objects.


Application Context:

, It acts as interface to represent IOC Container.
It extends Bean factory so it has all the features of Bean factory , Since its an interface we have to create subclass to connect with AC
to get the beans objects.

There are 3 Application context subclasses

1>ClasspathXMLApplicationContext: This will search xml configuration from java classpath
2>AnnotationConfigApplicationContext: This will search the bean classes based on the annotations provided on the bean classes.
3>FilesystemXMLApplicationContext :This will search the configuration from the file system

===========================================

XML Based Configuration:  Ex: SpringCoreXMLSettersDI
----------------------------

Suppose we have below 2 classes

class Student {

int id;
String name;
Address address;



}



class Address {

String street;
String city;
String state;
String country;

}


Spring IOC container first creates object of Address class and then sets all the field values in Address class and inject in other classes
where Address is a dependency and creates object of those classes.



Ways to do dependenc injection:
-------------------------------

Using Setter Injection : It uses setters to do dependency injection

Using Constructor Injection : It uses constructors to do dependency injection.




For IOC Container to create objects and do dependency injection we have to provide some info in configuration file

XML Based Configuration file:
-----------------------------

The classes provided in the xml conf file refered as "Beans"





-------------------------------------------
Data Types that IOC Container helps in Dependency Injection:


1)Primitive Data Types

Byte, short, char, int, float,double, long, boolean



2)Collection Type:

List, Set, Map and Properties


3>Reference Type(User Defined)

other class object


 







}


}

====================================
Creating maven project showing xml based dependency configuration:

SpringCoreXMLSettersDI

C:\Users\ASMA KAUSER\Spring
==============================================================
Property injection using p Schema and using value as attribute:

SpringCoreXMLPSchema


C:\Users\ASMA KAUSER\Spring
=================================================================

Collection Data Types DI:


As  shown in previous example how to configure bean with primitive data types now lets see for collection data types:


1> List (does not allow duplicates)

<bean>
<property name ="">
 <list>
    <value>10</value>
    <value>20</value>
    <value>30</value>
    <value>40</value>
    <value>50</value>
    <null/>
 </list>
</property>
</bean>


2>SET (does not allow duplicates)

<bean>
<property name ="">
 <set>
    <value>10</value>
    <value>20</value>
    <value>30</value>
    <value>40</value>
    <value>50</value>
    <null/>
 </set>
</property>
</bean>

3>Map

<bean>
<property name ="">
 <map>
    <entry key="java" value="2month">
    <entry key="python" value="1month">
 </map>
</property>
</bean>
===============================
4> Properties:

The properties object contains key and value pair both as a string. The java.util.Properties class is the subclass of Hashtable.

It can be used to get property value based on the property key. The Properties class provides methods to get data from the properties file and store data into the properties file. Moreover, it can be used to get the properties of a system.
Usage: The properties object contains key and value pair both as a string. The java.util.Properties class is the subclass of Hashtable.

It can be used to get property value based on the property key. The Properties class provides methods to get data from the properties file and store data into the properties file. Moreover, it can be used to get the properties of a system.

https://www.javatpoint.com/properties-class-in-java

<bean>
<property name ="">
 <props>
    <prop key="name">durgesh</prop>
    <prop key="channelName">Learncodewith Durgesh</prop>
 </props>
</property>
</bean>
========================================================================








============================================================

How to add lombok in eclipse

1>first download the  jar

https://projectlombok.org/download

2>Double clink on that jar and select the shown eclippse path

3> Click on Install/Update


4> Now restart the eclise

5> Add the lombok dependency in pom

6> Use annotations of lombok in pojo 

7> Refresh project if not detected
===========================================
How to add lombok in Intellij


https://www.youtube.com/watch?v=RwX1x7_k1b0

 

============================================
Reference Type(User Defined)

other class object


class A{

private int x;
private B ob;


}



class B{

private int y;

}

------------------

<bean class="com.springcore.ref.B" name="bref">

		<property name="y" value="1234" />
</bean>


<bean class="com.springcore.ref.A" name="aref">

		<property name="x" value="12" />


		<property name="ob">
			<ref bean="bref" />  <!-- this will place the reference of B object in A -->
		</property>


   OR

Using Value as Attribute:

<property name="ob" ref="bref"/> 

Or 

Using p Schema:

<bean class="com.springcore.ref.A" name="aref" p:ob-ref="bref"/> 



=======================CONSTRUCTOR BASE DI INJECTION====================================

In Constructor based injection if we dont give type in bean definition in config.xml by default it will consider as strings 
it will check  for  string, string variables constructor in class if not available then what ever first constructor it can find it will take that if we manually provide
type in bean def in xml and matching constructor is not there then  
it will give error unsatisfied dependency injection

 

If we want particular type constructor to call from bean class then we need to mention in bean def in xml file, also index represents which value
should be taken in 0th index and which 1st index

 <bean class="com.springcore.Calculate" name="calculate">
    <constructor-arg  value="12" type="int" index="1"/>
     <constructor-arg  value="22" type="int" index="0"/>
    
       </bean>
  So this constructor based ambiguity problem can be resolved by providing type  or by providing index
==================================CONSTRUCTOR BASE DI INJECTION FOR COLLECTIONS================================================================


Array:



                <constructor-arg>
			<array>
				<value>book1</value>
				<value>book2</value>
				<value>book3</value>
				<value>book4</value>

			</array>
		</constructor-arg>

-----------------------------------------------------
List:



                <constructor-arg>
			<list>
				<value>Chennai</value>
				<value>Pune</value>
				<value>Mumbai</value>
				<value>Bangalore</value>
			</list>

		</constructor-arg>


------------------------------------------------------

Map:

	<map>
              <entry key="Mobile" value="785469211" />
	      <entry key="Landline" value="0802548781" />
       </map>

-----------------------------------------------------


Reference Type DI:


<constructor-arg  ref="refname"/>




============================AUTOWIRING=========================================

In this feature of spring framework container injects the dependencies automatically.


Disadvantage of Autowiring:

Autowiring cant be used to inject primivitive and string values. It works with reference types only.


Again Autowiring we can do in 2 ways 

1>XML Based
2>Annotations Based



XML Based: 
=================

Autowiring modes 

1>no autowire tage means no autowiring by default its no	
2>By Name
3>By Type
4>Constructor
5>Autodetect



Annotations Based:
===================

Using @Autowired we do injections


@Autowire we can use at following places

>On Setters 
>On Property or ref variable 
>On constructor


If we have to use any annotation we have to add 
<context:annotation-config/> in the config.xml file to enable annotations 


Internally it uses byType autowiring so if we different bean name also in the config file it will do injection



> If we want to use @Autowired on setters then we can use @Autowired at reference variable setters then it will
get injected

> If we want to use @Autowired on constructor then we can use @Autowired at reference variable constructor then it will
get injected


---------------------------------------------------------

@Qualifier:


If we have more than one bean of the same type and want to wire only one of them then use the @Qualifier annotation along with @Autowired to specify which exact bean will be wired.


=========================================================

Stereotype Annotations:


@Component:

For Spring IOC container to create any bean object we have to configure bean details inside
<bean> tag in xml , but using @component stereotype we can avoid these configurations in xml file


===============================================================

How to use Collections like list with @Value annotations







Advantages of Autowiring:
=========================

Automatic

Less Code


DisAdvantages of Autowiring:
================================


No Control of Programmer
It cant be used for primitive and string values.




========================================================================

Bean Scope: 


There are 5 bean scope 

1>Singleton : Same object will be returned every time getBean is called
2>Prototype : Every time getBean is called new object is returned
3>request
4>session
5>globalsession



We can configure bean scope in 2 ways:

By default bean scope is singleton
Using XML:

we have to define scope in bean tag

<bean class =""  name="" scope=""/>

Using Annotations:

@Component
@Scope("")
class Student
{


}


===============================================================
Complete Annotations:

ways to configure bean for injection


@Component,@Bean


