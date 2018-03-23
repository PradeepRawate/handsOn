package com.hcl.designpatterns;
class User {
	int id;
	String name;
	String address;
	String mobile;
	
	private User(UserBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
		this.mobile = builder.mobile;
	}
	
	@Override
	public String toString() {
		return "id: "+id+"\tname: "+name+"\taddress: "+address+"\tmobile:" +mobile;
	}
	
	public static class UserBuilder{
		private int id;
		private String name;
		private String address;
		private String mobile;
		
		public UserBuilder setId(int id) {
			this.id = id;
			return this;
		}
		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		public UserBuilder setMobile(String mobile) {
			this.mobile = mobile;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}

public class BuilderPattern {
	
	public static void main(String[] args) {
		User user1 = new User.UserBuilder().setId(1).setName("Pradeep").build();
		User user2 = new User.UserBuilder().setId(2).setName("Raj").setMobile("8888888888").build();
		User user3 = new User.UserBuilder().setName("Pradeep").setAddress("Pune").build();
		log(user1);
		log(user2);
		log(user3);
	}
	
	public static void log(Object arg) {
		System.out.println(arg);
	}
}
