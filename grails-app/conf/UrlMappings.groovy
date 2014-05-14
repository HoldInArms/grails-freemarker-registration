class UrlMappings {

	static mappings = {
        "500"(view:'/error')
		
		"/"(controller:"Login", action:"index")
		"/login"(controller:"Login", action:"login")
		"/registration"(controller:"Registration", action:"index")
		"/users"(controller:"UserList", action:"index")
	}
}
