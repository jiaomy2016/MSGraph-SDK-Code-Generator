// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EntityType2;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type2With Reference Request Builder.
 */
public class EntityType2WithReferenceRequestBuilder extends BaseRequestBuilder implements IEntityType2WithReferenceRequestBuilder {

    /**
     * The request builder for the EntityType2
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityType2WithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEntityType2WithReferenceRequest instance
     */
    public IEntityType2WithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IEntityType2WithReferenceRequest instance
     */
    public IEntityType2WithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new EntityType2WithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEntityType2ReferenceRequestBuilder reference(){
        return new EntityType2ReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}