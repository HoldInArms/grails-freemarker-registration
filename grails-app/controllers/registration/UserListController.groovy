package registration

class UserListController {
	
	def beforeInterceptor = [action:this.&auth, except:["index"]]
	
	def auth(){
		if(!session.user){
			redirect(uri:"/login");
			return false;
		}
	}

    def index() {
		[ Users : User.list() ]
	}
}
