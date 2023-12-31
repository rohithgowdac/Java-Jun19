package com.xworkz.engineer.app.dto;

public class ApplicationDTO implements serializable {
	private int id;
	private String name;
	private String developedBy;
	private String developedAt;
	private String version;
	
	
	public ApplicationDTO() {
		
	}
	
    

	public ApplicationDTO(int id, String name, String developedBy, String developedAt, String version) {
		super();
		this.id = id;
		this.name = name;
		this.developedBy = developedBy;
		this.developedAt = developedAt;
		this.version = version;
	}

    @Override
    public boolean equals(Object obj) {
    	if(obj !=null) {
    		if(obj instanceof ApplicationDTO) {
    			ApplicationDTO ref=(ApplicationDTO)obj;
    			if(this.name.equals(ref.name) && this.developedBy.equals(ref.developedBy)) {
    				System.out.println("Instance are same ");
    				return true;
    				
    			}
    		}
    	}
    	return super.equals(obj);
    }

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDevelopedBy() {
		return developedBy;
	}


	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}


	public String getDevelopedAt() {
		return developedAt;
	}


	public void setDevelopedAt(String developedAt) {
		this.developedAt = developedAt;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "ApplicationDTO [id=" + id + ", name=" + name + ", developedBy=" + developedBy + ", developedAt="
				+ developedAt + ", version=" + version + "]";
	}


}

