class UrlMappings {

	static mappings = {
        "500"(view:'/error')
		
		"/"(controller:"Login", action:"index")
		"/registration"(controller:"Registration", action:"index")
		"/users"(controller:"UserList", action:"index")
	}
}
