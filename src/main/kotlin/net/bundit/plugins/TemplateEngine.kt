package net.bundit.plugins

import freemarker.cache.ClassTemplateLoader
import freemarker.core.HTMLOutputFormat
import io.ktor.server.application.*
import io.ktor.server.freemarker.*

fun Application.configureTemplateEngine() {

    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
        outputFormat = HTMLOutputFormat.INSTANCE
    }

}