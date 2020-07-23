package com.github.ohadraz.mypyplugin.services

import com.intellij.openapi.project.Project
import com.github.ohadraz.mypyplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
