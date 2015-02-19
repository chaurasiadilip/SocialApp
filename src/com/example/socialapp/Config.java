package com.example.socialapp;

public class Config {
	public static String LINKEDIN_CONSUMER_KEY = "78hm13gd73vtie";
	public static String LINKEDIN_CONSUMER_SECRET = "61ndrOMHOv2GTyOm";
	public static String scopeParams = "rw_nus+r_fullprofile+r_contactinfo+r_network";
	
	public static String OAUTH_CALLBACK_SCHEME = "x-oauthflow-linkedin";
	public static String OAUTH_CALLBACK_HOST = "xenium.in";
	public static String OAUTH_CALLBACK_URL = OAUTH_CALLBACK_SCHEME + "://" + OAUTH_CALLBACK_HOST;
}
