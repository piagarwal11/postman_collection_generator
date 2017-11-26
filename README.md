# postman_collection_generator
Postman collection generator for Spring Rest API

# Steps to Use
1. download and impor jar file from https://s3.ap-south-1.amazonaws.com/letsdoitweb/PostManCollectionGenerator.jar
2. download/check for required libraries mentioned below
3. copy sample code and run


# Libraries required
1. GSON
2. jackson-annotations
3. javax.persistence
4. paranamer-2.3
5. org.spring.web 3.0.4



# Code Sample
```
Class[] input_classes = {AdminController.class, UserController.class};

PostmanCollectionBuilder builder  = new PostmanCollectionBuilder("Test", new CollectionBuilderProperties() {

  @Override
  public String getUrl(Method method) {

    if(method.isAnnotationPresent(RequestMapping.class)){
      return method.getAnnotation(RequestMapping.class).value()[0];
    }else{
      return null;
    }
  }

  @Override
  public String getHttpMethod(Method method) {
    
    if(method.isAnnotationPresent(RequestMapping.class)){
      return method.getAnnotation(RequestMapping.class).method()[0].name();
    }else{
      return null;
    }
  }
}, "/home/user/Desktop/collection.json",input_classes, "/home/user/input_key_value_file.txt");

builder.addHeader("api-token", "(.*)");
builder.addHeader("refesh-token", "(.*)/admin/(.*)");


builder.build();
```

