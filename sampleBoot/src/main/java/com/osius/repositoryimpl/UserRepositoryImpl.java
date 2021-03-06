package com.osius.repositoryimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.osius.entity.User;

@SuppressWarnings("unchecked")
@Service
public class UserRepositoryImpl {

	public User saveUser(User user) {
        ObjectOutputStream objOps = null;
        
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Resource resource = new ClassPathResource("Users.txt");
        
        try {
        	fileIs = new FileInputStream(resource.getFile());
        	if(fileIs.available() > 0) {
            objIs = new ObjectInputStream(fileIs);
            	List<User> users = (List<User>) objIs.readObject();
        		for (User userToUpdate : users) {
        			if(userToUpdate.getId().equals(user.getId())) {
        				userToUpdate.setPinCode(user.getPinCode());
        				userToUpdate.setBirthDate(user.getBirthDate());
        			}
        		}
        		objOps = writeToFile(users, resource.getFile());
            	objOps.flush();
            } else {
        		List<User> newUsers = Arrays.asList(user);
        		objOps = writeToFile(newUsers, resource.getFile());
        	}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
            try{
                if(objOps != null) objOps.close();
            } catch (Exception ex){
                 
            }
        }
		return user;
	}

	private ObjectOutputStream writeToFile(List<User> users, File file) throws FileNotFoundException, IOException {
		OutputStream ops;
		ObjectOutputStream objOps;
		ops = new FileOutputStream(file,true);
		objOps = new ObjectOutputStream(ops);
		objOps.writeObject(users);
		return objOps;
	}
	
	public List<User> getUsers(){
        
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        List<User> users = null;
        Resource resource = new ClassPathResource("Users.txt");
		try {
            fileIs = new FileInputStream(resource.getFile());
            objIs = new ObjectInputStream(fileIs);
			users  = (List<User>) objIs.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(objIs != null) objIs.close();
            } catch (Exception ex){
                 
            }
        }
		return users;
         
    }

	public void saveUsers(List<User> users) {
		OutputStream ops = null;
        ObjectOutputStream objOps = null;
        Resource resource = new ClassPathResource("Users.txt");
        try {
        	ops = new FileOutputStream("Users.txt");
        	objOps = new ObjectOutputStream(ops);
			objOps = writeToFile(users, resource.getFile());
            objOps.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(objOps != null) objOps.close();
            } catch (Exception ex){
                 
            }
        }
	}

}
