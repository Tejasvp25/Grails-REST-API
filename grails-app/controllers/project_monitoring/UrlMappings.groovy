package project_monitoring

class UrlMappings {

    static mappings = {
        // Controller College
        // "/college"(controller: "college", action: "index", method:"GET")
        // "/college/$id"(controller: "city", action: "show", method:"GET")

        // "/college"(controller: "college", action: "save", method:"POST")
        // "/college/$id"(controller: "college", action: "update", method:"PUT")

        // "/college/$id"(controller: "college", action: "delete", method:"DELETE")

        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

  
        // Controller Project_Type
        // "/project_type/"(controller: "project_type", action: "index", method:"GET")
        // "/project_type/$id"(controller: "project_type", action: "show", method:"GET")

        // "/project_type/"(controller: "project_type", action: "save", method:"POST")
        // "/project_type/$id"(controller: "project_type", action: "update", method:"PUT")

        // "/project_type/$id"(controller: "project_type", action: "delete", method:"DELETE")

        // // Controller Roles
        // "/roles"(controller: "roles", action: "index", method:"GET")
        // "/roles/$id"(controller: "roles", action: "show", method:"GET")

        // "/roles"(controller: "roles", action: "save", method:"POST")
        // "/roles/$id"(controller: "roles", action: "update", method:"PUT")

        // "/roles/$id"(controller: "roles", action: "delete", method:"DELETE")

        // // Controller Status
        // "/status"(controller: "status", action: "index", method:"GET")
        // "/status/$id"(controller: "status", action: "show", method:"GET")

        // "/status"(controller: "status", action: "save", method:"POST")
        // "/status/$id"(controller: "status", action: "update", method:"PUT")

        // "/status/$id"(controller: "status", action: "delete", method:"DELETE")

        // // Controller Support
        // "/support"(controller: "support", action: "index", method:"GET")
        // "/support/$id"(controller: "support", action: "show", method:"GET")

        // "/support"(controller: "support", action: "save", method:"POST")
        // "/support/$id"(controller: "support", action: "update", method:"PUT")

        // "/support/$id"(controller: "support", action: "delete", method:"DELETE")

        // // Controller Support_Reason
        // "/support_reason"(controller: "support_reason", action: "index", method:"GET")
        // "/support_reason/$id"(controller: "support_reason", action: "show", method:"GET")

        // "/support_reason"(controller: "support_reason", action: "save", method:"POST")
        // "/support_reason/$id"(controller: "support_reason", action: "update", method:"PUT")

        // "/support_reason/$id"(controller: "support_reason", action: "delete", method:"DELETE")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
 