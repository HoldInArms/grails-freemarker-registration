package registration

class LoginController {

    def index() { 
		System.out.println( User.list().size() );
	}
	
	def login() {
		System.out.println( params.username +" "+ params.password );
		
		redirect(action: "index");
	}
	
	def toRegistration() {
		redirect( controller: "Registration", action: "index" );
	}
}
