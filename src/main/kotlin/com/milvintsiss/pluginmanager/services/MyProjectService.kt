package com.milvintsiss.pluginmanager.services

import com.milvintsiss.pluginmanager.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
