package com.ken.kousen.feb2024;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.filechooser.FileFilter;

import org.junit.jupiter.api.Test;

public class FileFilterTest extends FileFilter {
	private final File root=new File("src/aquarium");
	
@Test	
void listoffiles() {
	File[] files=root.listFiles();
	
//	assert files!=null;
//	for(File f:files) {
//		System.out.println(f);
//	}
	
//	assertEquals(3, actual);
	
}

@Test	
void listofdirectories() {
	File[] dire=root.listFiles((File f)->f.isDirectory());
	assert dire!=null;
	assertEquals(0, dire);
	
}

@Test	
void listofdirectories_blocklamda() {
	File[] dire=root.listFiles(f->{
		System.out.println("filename"+f.getName());
		f.isDirectory();
		return f.isDirectory();
		});
	assert dire!=null;
	assertEquals(0, dire);
	
}

@Test	
void listofdirectories_filefiltervariable() {
	File[] dire=root.listFiles((File f)->{
		System.out.println("filename"+f.getName());
		f.isDirectory();
		return f.isDirectory();
		});
	assert dire!=null;
	assertEquals(0, dire);
	
}
@Test	
void listjavasourcefiles() {
	File[] dire=root.listFiles((File dir,String name)->name.endsWith(".java"));
//	FilenameFilter dire=root.listFiles((File dir,String name)->name.endsWith(".java"));
	assert dire!=null;
	assertEquals(3, dire);
	
}
@Test	
void foreachlisttest() {
	List<String> ll=Arrays.asList("this","is","a");
	ll.forEach(x->System.out.print(x));
//	assertEquals("thisisa", ll.forEach(x->System.out.print(x)));
	Map<String,String> kk = new HashMap<String,String>();
	kk.forEach((k,v)->System.out.println(k+"="+v));
	
	
}
@Override
public boolean accept(File f) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public String getDescription() {
	// TODO Auto-generated method stub
	return null;
}
}
