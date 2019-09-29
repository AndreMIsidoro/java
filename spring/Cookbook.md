**Run springboot with external applications.properties**

	java -jar yourJar.jar --spring.config.location=file:/etc/operator/bms-support-tool/application.properties

**Use webapp context in jsp**

	in the applications.properties:

	server.context-path=/bms-support-tool

	in the jsp:

	<script type="application/javascript" src="${pageContext.request.contextPath}/resources/js/external/jquery-3.1.0.min.js"></script>
	

**Print All Rest Endpoints Mapped By the Application**

    @Component
    public class AndreTest implements
    ApplicationListener<ContextRefreshedEvent> {

    
        public static int counter;
    
        @Override public void onApplicationEvent(ContextRefreshedEvent event) {
            counter++;
            if (event instanceof ContextRefreshedEvent) {
                ApplicationContext applicationContext = ((ContextRefreshedEvent) event).getApplicationContext();
                applicationContext.getBean(RequestMappingHandlerMapping.class).getHandlerMethods().forEach((x, y) -> {System.out.println(x);System.out.println(y);});
            }
        }
    }


    or Inspect the Bean

**Print All Env proprieties (including the ones of the application.properties)**

    @Component
    public class AndreTest implements
    ApplicationListener<ContextRefreshedEvent> {

        @Autowired
        private Environment env;
    
        @Override public void onApplicationEvent(ContextRefreshedEvent event) {
            
            ApplicationContext applicationContext = ((ContextRefreshedEvent) event).getApplicationContext();
        
            Map<String, Object> map = new HashMap();
            for(Iterator it = ((AbstractEnvironment) env).getPropertySources().iterator(); it.hasNext(); ) {
                PropertySource propertySource = (PropertySource) it.next();
                if (propertySource instanceof MapPropertySource) {
                    map.putAll(((MapPropertySource) propertySource).getSource());
                }
            }
            
        }
    }


**Annotations**


    │ @Component │ generic stereotype for any Spring-managed component │ 
    │ @Repository│ stereotype for persistence layer │ 
    │ @Service │ stereotype for service layer │ 
    │ @Controller│ stereotype for presentation layer (spring-mvc) │ 
