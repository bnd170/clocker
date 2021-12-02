package com.github.bnd170.clocker.services

import com.intellij.openapi.project.Project
import com.github.bnd170.clocker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
