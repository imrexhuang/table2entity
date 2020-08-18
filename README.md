# 注意
產生的Entity程式碼並未符合JPA 規範，產生後仍需手動調整，還在研究如何精進

或是可以使用JOOQ

http://samchu.logdown.com/posts/7030828-how-to-use-jooq-generate-entity-with-the-jpa-specification

※Warning:

This project is still being developed!

Alternative choice 1:NetBeans (New -> Other -> Persistence -> Entity Classes from Database )
![image description](pic\NetBeansReverseJPAEntity.png)

Alternative choice 2:JOOQ

https://www.jooq.org

# Environment

Java 8

# Table2Entity

Simple tool to generate POJO classes from database tables/columns. ###

Supports all JDBC supported databases. Includes following JDBC drivers: 
- SQL Server
- Oracle 
- MySQL 
- PostgreSQL 

JDBC drivers can be added/updated in `build.gradle` file. 

## Build

Use gradle to build and assemble jar files with dependencies. 
```
gradle fatJar
```

## Run

Configure the database connection properties in `db.properties` file in current directory: 

```
driver=com.microsoft.sqlserver.jdbc.SQLServerDriver
url=jdbc:sqlserver://127.0.0.1:1433;databaseName=AdventureWorks
username=username
password=password
```

Run the jar, generate POJOs for all the tables in database 
```
java -jar build/libs/table2entity-all.jar -a
```

Run the jar, generate POJOs for all the tables in database (specifying schema name) 
```
java -jar build/libs/table2entity-all.jar -s dbo
```

Run the jar with arguments. 
```
java -jar build/libs/table2entity-all.jar -t dbo.Person,dbo.Production,dbo.Sales
```

## Options 

Option | Description
-------|------------
h | help 
a | generate POJOs for all the tables in database  
s | generate POJOs for all the tables in database (specifying schema name)
t | list of database tables delimited by ; (semicolon). overrides `a` option 
r | (optional) number of concurrent threads, default 2
p | (optional) java package name of the POJOs. If not specified, default/blank package will be used. 
d | (optional) target directory where POJOs (.Java files) are generated. If not specified, current directory will be used 
