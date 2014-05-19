package registration

class User {
	
	Long id;
	
	String username;
	
	String password;
	
	String email;

    static constraints = {
		id(unique:true);
		username(unique:true);
		password(password:true);
    }
}
