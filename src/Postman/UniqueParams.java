package Postman;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.Transient;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.paranamer.AnnotationParanamer;
import com.thoughtworks.paranamer.BytecodeReadingParanamer;
import com.thoughtworks.paranamer.CachingParanamer;
import com.thoughtworks.paranamer.Paranamer;

//import corporate_stop.Modules.BusTracking.BusTrackingController;
//import corporate_stop.Modules.Complaints.ComplaintController;
//import corporate_stop.Modules.Diary.MyDiaryController;
//import corporate_stop.Modules.Feedback.FeedbackController;
//import corporate_stop.Modules.FileManager.FIleManagerController;
//import corporate_stop.Modules.Gallery.GalleryController;
//import corporate_stop.Modules.GenericChat.GenericChatController;
//import corporate_stop.Modules.GradeBook.GradeBookController;
//import corporate_stop.Modules.IAUM.IAUMController;
//import corporate_stop.Modules.Leave.LeaveController;
//import corporate_stop.Modules.NoticesModule.NoticesController;
//import corporate_stop.Modules.Search.SearchController;
//import corporate_stop.Modules.SyllabusTracking.SYTrCOntroller;
//import corporate_stop.Modules.TimeLine.TimeLineController;
//import corporate_stop.Modules.TimeTable.TimeTableController;
//import corporate_stop.controllers.AdminController;
//import corporate_stop.controllers.ClassController;
//import corporate_stop.controllers.ImageUpload;
//import corporate_stop.controllers.LoginController;
//import corporate_stop.controllers.ParentController;
//import corporate_stop.controllers.StudentController;
//import corporate_stop.controllers.SuperAdminController;
//import corporate_stop.controllers.TeacherController;
//import corporate_stop.utils.postman.Body;
//import corporate_stop.utils.postman.Formdata;
//import corporate_stop.utils.postman.Item;
//import corporate_stop.utils.postman.Potsman;
//import corporate_stop.utils.postman.Request;

public class UniqueParams {

	static Class[] classes ={
//			AdminController.class, 
//			ClassController.class, 
//			ImageUpload.class,
//			LoginController.class,
//			ParentController.class, 
//			StudentController.class, 
//			SuperAdminController.class, 
//			TeacherController.class,
//			BusTrackingController.class,
//			ComplaintController.class,
//			MyDiaryController.class,
//			FeedbackController.class,
//			FIleManagerController.class,
//			GalleryController.class,
//			GenericChatController.class,
//			GradeBookController.class,
//			IAUMController.class,
//			LeaveController.class,
//			NoticesController.class,
//			SearchController.class,
//			SuperAdminController.class,
//			SYTrCOntroller.class,
//			TimeLineController.class,
//			TimeTableController.class,
		};
	static Set<String> unique_params = new HashSet<>();
	static Paranamer info = new CachingParanamer(new AnnotationParanamer(new BytecodeReadingParanamer()));
	public static void main(String[] args) {
		
		
		
		
		for(Class t : classes){

			for(Method method : t.getDeclaredMethods()){
				
				if(method.isAnnotationPresent(RequestMapping.class)){
					String[] parameter_names = info.lookupParameterNames(method);

					for(int i=0; i< method.getParameterCount() ; i++){
						if(method.getParameters()[i].getAnnotation(ModelAttribute.class)!=null){
							ArrayList<Formdata> formDataFromModel = getFormDataFromModel(method.getParameters()[i].getType());
							for(Formdata formdata  : formDataFromModel){
								System.out.println(t.getCanonicalName() +" " + method.getName() + " " + formdata.getKey());
								setUniqueParam(formdata.getKey());
							}
							
						}else{
							if(method.getParameters()[i].getType().equals(Long.class)){
								System.out.println(t.getCanonicalName() +" " + method.getName() + " " + info.lookupParameterNames(method)[i]);
								setUniqueParam(info.lookupParameterNames(method)[i]);
							}
							

						}
					}

				


				}
			}
		}
		
		
		writeToFile(unique_params);


	}


	private static void setUniqueParam(String key) {
		// TODO Auto-generated method stub
		if(!unique_params.contains(key))
			unique_params.add(key);
	}

	
	private static ArrayList<Formdata> getFormDataFromModel(Class<?> t) {
		ArrayList<Formdata> formdatas = new ArrayList<>();
		for(Field field : t.getDeclaredFields()){
			if(!field.isAnnotationPresent(Transient.class) && field.getType().equals(Long.class)){
				Formdata formdata = new Formdata();
				formdata.setKey(field.getName());
				formdata.setType("text");
				formdatas.add(formdata);
			}
		}
		return formdatas;
	}
	
	private static void writeToFile(Set<String> unique_params2) {
		// TODO Auto-generated method stub
		
		Iterator itr = unique_params.iterator();
		
		BufferedWriter writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("/home/piyush/Desktop/uniqueparam.json"),"ASCII"));
		    while(itr.hasNext()){
		    	writer.append(itr.next().toString());
		    	writer.append("=\n");
		    	
		    	
			}
		    
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
		
		
		
		
		
		
		
	}


}
