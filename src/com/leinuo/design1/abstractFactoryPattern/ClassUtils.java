package com.leinuo.design1.abstractFactoryPattern;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Create by leinuo on 20-1-14 上午11:50
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class ClassUtils {
    public static List<Class> getAllClassByInterface(Class c){
        List<Class> classList = new ArrayList<>();
        if(c.isInterface()){
            String packageName = c.getPackage().getName();
            try {
                List<Class> allClass = getClasses(packageName);
                for(int i=0;i<allClass.size();i++){
                   if(c.isAssignableFrom(allClass.get(i))){
                       if(!c.equals(allClass.get(i))){
                           classList.add(allClass.get(i));
                       }
                   }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return classList;
    }

    private static List<Class> getClasses(String packageName) throws IOException, ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".","/");
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<>();
        while (resources.hasMoreElements()){
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<>();
        for(File directory:dirs){
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }

    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classList = new ArrayList<>();
        if(!directory.exists()){
            return classList;
        }
        File[] files = directory.listFiles();
        for(File file:files){
            if(file.isDirectory()){
                assert !file.getName().contains(".");
                classList.addAll(findClasses(file,packageName+"."+file.getName()));
            }else if(file.getName().endsWith(".class")){
                classList.add(Class.forName(packageName+"."+file.getName().substring(0,file.getName().length()-6)));
            }
        }
        return classList;
    }


}
