package com.manager.system.config.security;

public class ApiResponse {
	private int status;
    private String statusText;
    private String currentAuthority;

    public ApiResponse(int code, String statusText, String currentAuthority) {
        this.status = code;
        this.statusText = statusText;
        this.currentAuthority = currentAuthority;
    }

    public int getStatus() {
        return status;
    }

    public void setSuccess(int status) {
        this.status = status;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
    
    public String getCurrentAuthority() {
        return currentAuthority;
    }

    public void setCurrentAuthority(String currentAuthority) {
        this.currentAuthority = currentAuthority;
    }
}