class UrlMappings {

	static mappings = {
        "500"(view:'/error')
		
		"/"(controller:"Login", action:"index")
		"/registration"(controller:"Registration", action:"index")
		"/auth/login"(controller:"Login", action:"login")
		"/auth/logout"(controller:"Login", action:"logout")
		"/auth/registration"(controller:"Registration", action:"registration")
		"/users"(controller:"UserList", action:"index")
	}
}
