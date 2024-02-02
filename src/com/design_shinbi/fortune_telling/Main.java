package com.design_shinbi.fortune_telling;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		List<Class<?>> classes = getClasses();
		
		double random = Math.random();
		int index = (int)Math.floor(random * (double)classes.size());
		Class<?> clazz = classes.get(index);
		FortuneTelling object = (FortuneTelling)clazz.getDeclaredConstructor().newInstance();
		
		Result result = Result.getRandom();
		String name = object.getName();
		String message = object.getMessage(result);
		
		System.out.println("=== 今日の占い結果 ===");
		System.out.println(result.getName());
		System.out.println(name + " のお言葉");
		System.out.println(message);
	}
	
	public static List<Class<?>> getClasses() throws IOException, ClassNotFoundException {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		
		String packageName = "com.design_shinbi.fortune_telling.content";
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Enumeration<URL> urls = loader.getResources(packageName.replace(".", "/"));
		while(urls.hasMoreElements()) {
			URL url = urls.nextElement();
			File folder = new File(url.getPath());
			for(File child : folder.listFiles()) {
				String fileName = child.getName();
				if(fileName.endsWith(".class")) {
					String className = fileName.replace(".class", "");
					Class<?> clazz = Class.forName(packageName + "." + className);
					classes.add(clazz);
				}
			}
		}
		
		return classes;
	}
}