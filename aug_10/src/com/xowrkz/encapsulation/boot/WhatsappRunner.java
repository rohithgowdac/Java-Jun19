package com.xowrkz.encapsulation.boot;
import com.xworkz.encapsulation.app.Whatsapp;
public class WhatsappRunner {
		public static void main(String[] args) {
			System.out.println("Runing main in WhatsappRunner");
			
			Whatsapp whatsapp=new Whatsapp();
			
			System.out.println(whatsapp.getDevelopCompany());
			whatsapp.setDevelopCompany("Whatsapp");
			System.out.println("company: "+whatsapp.getDevelopCompany());
			

			System.out.println(whatsapp.getEncryption());
			whatsapp.setEncryption(true);
			System.out.println(whatsapp.getEncryption());
			
			System.out.println(whatsapp.getGroups());
			whatsapp.setGroups(true);
			System.out.println(whatsapp.getGroups());
			
			System.out.println(whatsapp.getLatestVersion());
			whatsapp.setLatestVersion(25.20f);
			System.out.println(whatsapp.getLatestVersion());
			
			System.out.println(whatsapp.getLocationSharing());
			whatsapp.setLocationSharing(true);
			System.out.println(whatsapp.getLocationSharing());
			
			System.out.println(whatsapp.getMaxGroupSize());
			whatsapp.setMaxGroupSize(256);
			System.out.println(whatsapp.getMaxGroupSize());
			
			System.out.println(whatsapp.getMessaging());
			whatsapp.setMessaging(true);
			System.out.println(whatsapp.getMessaging());
			
			System.out.println(whatsapp.getMultimediaSharing());
			whatsapp.setMultimediaSharing(true);
			System.out.println(whatsapp.getMultimediaSharing());
			
			System.out.println(whatsapp.getPrimaryColor());
			whatsapp.setPrimaryColor("green");
			System.out.println(whatsapp.getPrimaryColor());
			
			System.out.println(whatsapp.getStartedYear());
			whatsapp.setStartedYear(2009);
			System.out.println(whatsapp.getStartedYear());
			
			System.out.println(whatsapp.getStatusUpdates());
			whatsapp.setStatusUpdates(true);
			System.out.println(whatsapp.getStatusUpdates());
			
			System.out.println(whatsapp.getUserBase());
			whatsapp.setUserBase(2000000000);
			System.out.println(whatsapp.getUserBase());
			
			System.out.println(whatsapp.getVideoCalls());
			whatsapp.setVideoCalls(true);
			System.out.println(whatsapp.getVideoCalls());
			
			System.out.println(whatsapp.getVoiceCalls());
			whatsapp.setVoiceCalls(true);
			System.out.println(whatsapp.getVoiceCalls());
			
		
			
		}
		


	}
	
	