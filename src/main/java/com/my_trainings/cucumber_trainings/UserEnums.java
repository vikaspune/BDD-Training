package com.my_trainings.cucumber_trainings;

public enum UserEnums implements IData<User> {
	ADMIN_USER {

		public User getData() {
			User user = new User();
			user.setUsername("abc");
			user.setPassword("xyz");
			return user;
		}

	}
}
