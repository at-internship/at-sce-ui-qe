package com.at.enums;

public enum Resources {
	
    logInView("https://at-sce-ui-qa.herokuapp.com/"),
	AdminView("https://at-sce-ui-qa.herokuapp.com/admin/");
	
    private String path;
    Resources(String path){
        this.path=path;
    }

    public String getPath(){
        return this.path;
    }
}
