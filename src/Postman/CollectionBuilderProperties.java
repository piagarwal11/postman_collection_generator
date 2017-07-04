package Postman;

import java.lang.reflect.Method;

public interface CollectionBuilderProperties {
	
	public String getUrl(Method method);
	
	public String getHttpMethod(Method method);
	
	

}
