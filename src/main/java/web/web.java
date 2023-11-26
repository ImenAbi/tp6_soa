package web;

//public class web {
//}
public class MyConfig {
    @Bean
    ResourceConfig resourceConfig(){

        ResourceConfig resourceConfig =new ResourceConfig();
        resourceConfig.register(RestJaxrs.class);
        return  resourceConfig;
    }
}
