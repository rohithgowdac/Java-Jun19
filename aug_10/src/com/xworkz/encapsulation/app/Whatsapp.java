package com.xworkz.encapsulation.app;

public class Whatsapp {
	
	private String developCompany="Facebook";
	private int startedYear= 2009;
	private double userBase= 2000000000;
	private float latestVersion=25.5f;
	private String primaryColor="Green";
    private int maxGroupSize= 256;
    private boolean messaging= true;
    private boolean encryption= true;
    private boolean voiceCalls= true;
    private boolean videoCalls= true;
    private boolean groups = true;
    private boolean statusUpdates =true;
    private boolean multimediaSharing =true;
    private boolean locationSharing= true;
    
    public String getDevelopCompany() {
    	return this.developCompany;
    }
    
    public void setDevelopCompany(String developCompany) {
    	this.developCompany=developCompany;
    }
    
    public int getStartedYear() {
    	return this.startedYear;
    }
    
    public void setStartedYear(int startedYear) {
    	this.startedYear=startedYear;
    }
    
    public double getUserBase() {
    	return this.userBase;
    }
    
    public void setUserBase(double userBase) {
    	this.userBase=userBase;
    }
    
    public float getLatestVersion() {
    	return this.latestVersion;
    }
    
    public void setLatestVersion(float latestVersion) {
    	this.latestVersion=latestVersion;
    }
    
    public String getPrimaryColor() {
    	return this.primaryColor;
    }
    
    public void setPrimaryColor(String primaryColor) {
    	this.primaryColor=primaryColor;
    }
    
    public int getMaxGroupSize() {
    	return this.maxGroupSize;
    }
    
    public void setMaxGroupSize(int maxGroupSize) {
    	this.maxGroupSize=maxGroupSize;
    }
    
    public boolean getMessaging() {
    	return this.messaging;
    }
    
    public void setMessaging(boolean messaging) {
    	this.messaging=messaging;
    }
    
    public boolean getEncryption() {
    	return this.encryption;
    }
    
    public void setEncryption(boolean encryption) {
    	this.encryption=encryption;
    }
    
    public boolean getVoiceCalls() {
    	return this.voiceCalls;
    }
    
    public void setVoiceCalls(boolean voiceCalls) {
    	this.voiceCalls=voiceCalls;
    }
    
    public boolean getVideoCalls() {
    	return this.videoCalls;
    }
    
    public void setVideoCalls(boolean videoCalls) {
    	this.videoCalls=videoCalls;
    }
    
    public boolean getGroups() {
    	return this.groups;
    }
    
    public void setGroups(boolean groups) {
    	this.groups=groups;
    }
    
    public boolean getStatusUpdates() {
    	return this.statusUpdates;
    }
    
    public void setStatusUpdates(boolean statusUpdates) {
    	this.statusUpdates=statusUpdates;
    }
    
    public boolean getMultimediaSharing() {
    	return this.multimediaSharing;
    }
    
    public void setMultimediaSharing(boolean multimediaSharing) {
    	this.multimediaSharing=multimediaSharing;
    }
    
    public boolean getLocationSharing() {
    	return this.locationSharing;
    }
    
    public void setLocationSharing(boolean locationSharing) {
    	this.locationSharing=locationSharing;
    }


}
