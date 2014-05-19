package registration

class LoginController {

    def index() { 
		System.out.println( User.list().size() );
	}
	
	def login() {
		def user = User.findByUsernameAndPassword( params.username, params.password );
		
		if( user != null ){
			session.user = user;
			redirect( controller : "UserList", action : "index" );
		}else{
			System.out.println( "Null" );
			redirect( uri: "/");
		}	
		
	}

}
