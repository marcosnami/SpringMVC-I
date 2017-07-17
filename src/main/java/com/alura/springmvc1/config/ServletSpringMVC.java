package com.alura.springmvc1.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by MarcosNami on 7/15/2017.
 */
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebAppConfig.class, JPAConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
