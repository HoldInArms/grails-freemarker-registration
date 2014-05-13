package registration

class LoginController {

    def index() { }
	
	def login() {
		System.out.println( params.username +" "+ params.password );
		
		redirect(action: "index");
	}
}
