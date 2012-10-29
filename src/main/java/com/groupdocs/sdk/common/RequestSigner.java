package com.groupdocs.sdk.common;

import com.sun.jersey.api.client.WebResource.Builder;

public interface RequestSigner {

	String signUrl(String url);
	
	String signContent(String requestBody, Builder builder);
	
}

