class UrlMappings {

	static mappings = {
        "500"(view:'/error')
		
		"/"(controller:"Login", action:"index")
		"/login"(controller:"Login", action:"login")
		"/registration"(controller:"Registration", action:"index")
		"/registration/registration"(controller:"Registration", action:"registration")
		"/users"(controller:"UserList", action:"index")
	}
}
