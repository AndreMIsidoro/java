Layman's terms:

    JDBC is a standard for Database Access
    JPA is a standard for ORM

JDBC is a standard for connecting to a DB directly and running SQL against it - e.g SELECT * FROM USERS, etc. 
Datasets can be returned which you can handle in your app, and you can do all the usual things like INSERTS, DELETES, run stored procedures, etc. It is one of the underlying technologies behind most java database access (including JPA providers).
One of the issues with traditional JDBC apps is that you can often have some crappy code where lots of mapping between datasets and objects occur, logic is mixed in with SQL, etc.

JPA is a standard for Object Relational Mapping. This is a technology which allows you to map between objects in code and database tables. This can "hide" the SQL from the developer so that all they deal with are java classes, and the provider allows you to save them and load them magically. 
Mostly, XML mapping files or annotations on getters, setters can be used to tell the JPA provider which fields on your object map to which fields in the DB. The most famous JPA provider is Hibernate, so is a good place to start for concrete examples.

Other examples include OpenJPA, toplink, etc.
Under the hood, Hibernate and most other providers for JPA write SQL and use JDBC to read and write to the DB.
