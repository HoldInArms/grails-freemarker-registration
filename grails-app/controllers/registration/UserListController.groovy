package registration

class UserListController {

    def index() { 
		[ Users : User.list() ]
	}
}
