package registration

class LoginController {

    def index() { 
		System.out.println( User.list().size() );
	}
	
	def login() {
		def user = User.findByUsernameAndPassword( params.username, params.password );
		
		if( user != null ){
			System.out.println( "Not null" );
		}else{
			System.out.println( "Null" );
		}
		
		redirect(action: "index");
	}
	
	def toRegistration() {
		redirect( controller: "Registration", action: "index" );
	}
}
