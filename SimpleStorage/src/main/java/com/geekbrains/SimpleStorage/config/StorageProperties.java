package com.geekbrains.SimpleStorage.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

   public void setLocation(String location) {

        this.location = location;

    }
/*    public void setLocation(String location) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserName = authentication.getName();
            this.location = "upload-dir/"+currentUserName;
        } else this.location = location;

    }*/

}
/* Разобраться как запихнуть это в проперти файл
https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/configuration-metadata.html#configuration-metadata-annotation-processor*/
