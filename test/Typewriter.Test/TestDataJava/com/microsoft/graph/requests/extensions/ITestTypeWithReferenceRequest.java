// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Test Type With Reference Request.
 */
public interface ITestTypeWithReferenceRequest extends IHttpRequest {

    void post(final TestType newTestType, final IJsonBackedObject payload, final ICallback<TestType> callback);

    TestType post(final TestType newTestType, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<TestType> callback);

    TestType get() throws ClientException;

	void delete(final ICallback<TestType> callback);

	void delete() throws ClientException;

	void patch(final TestType sourceTestType, final ICallback<TestType> callback);

	TestType patch(final TestType sourceTestType) throws ClientException;

    ITestTypeWithReferenceRequest select(final String value);

    ITestTypeWithReferenceRequest expand(final String value);

}