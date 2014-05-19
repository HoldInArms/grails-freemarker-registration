package registration

class RegistrationController {

    def index() { }
	
	def registration() {
		def user = new User(
			username : params.username,
			password : params.password,
			email : params.email
		);
	
		user.save();
		
		redirect(
			uri : "/"
		);
	}
}
