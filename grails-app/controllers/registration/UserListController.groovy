package registration

class UserListController {
	
	def beforeInterceptor = {
		if(!session.user){
			redirect(uri:"/")
			return false
		}
	}

    def index() {
		[ Users : User.list() ]
	}
	
}
