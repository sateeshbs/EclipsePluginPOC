package com.psl.model;

import java.util.List;

public class UserDetails {
	
	String userName;
	String password;
	String url;
	boolean isUrlAccessible;
	boolean isAuthorised;
	List<RepositoryFile>  repositoryFiles;
	String repositoryName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isUrlAccessible() {
		return isUrlAccessible;
	}
	public void setUrlAccessible(boolean isUrlAccessible) {
		this.isUrlAccessible = isUrlAccessible;
	}
	public boolean isAuthorised() {
		return isAuthorised;
	}
	public void setAuthorised(boolean isAuthorised) {
		this.isAuthorised = isAuthorised;
	}
	public List<RepositoryFile> getRepositoryFiles() {
		return repositoryFiles;
	}
	public void setRepositoryFiles(List<RepositoryFile> repositoryFiles) {
		this.repositoryFiles = repositoryFiles;
	}
	public String getRepositoryName() {
		return repositoryName;
	}
	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}
	
	
	

}
