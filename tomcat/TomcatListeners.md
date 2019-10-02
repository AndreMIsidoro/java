A Listener element defines a component that performs actions when specific events occur, usually Tomcat starting or Tomcat stopping.

Listeners may be nested inside a Server, Engine, Host or Context. Some Listeners are only intended to be nested inside specific elements.

All implementations of Listener support the following attributes:

	className - Java class name of the implementation to use. This class must implement the org.apache.catalina.LifecycleListenerinterface.


**Order of Listeners**

	You can rely on the fact that the listeners are called in the order you specified in web.xml.


##Type Of Listeners

**ServletContextListener**

    Called when the webapp the defines it (in the web.xml) is initialized;	