// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;
import com.microsoft.graph2.callrecords.models.extensions.Option;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Option Request.
 */
public interface IOptionRequest extends IHttpRequest {

    /**
     * Gets the Option from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Option> callback);

    /**
     * Gets the Option from the service
     *
     * @return the Option from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Option get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Option> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Option with a source
     *
     * @param sourceOption the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Option sourceOption, final ICallback<Option> callback);

    /**
     * Patches this Option with a source
     *
     * @param sourceOption the source object with updates
     * @return the updated Option
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Option patch(final Option sourceOption) throws ClientException;

    /**
     * Posts a Option with a new object
     *
     * @param newOption the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Option newOption, final ICallback<Option> callback);

    /**
     * Posts a Option with a new object
     *
     * @param newOption the new object to create
     * @return the created Option
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Option post(final Option newOption) throws ClientException;

    /**
     * Posts a Option with a new object
     *
     * @param newOption the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Option newOption, final ICallback<Option> callback);

    /**
     * Posts a Option with a new object
     *
     * @param newOption the object to create/update
     * @return the created Option
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Option put(final Option newOption) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOptionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOptionRequest expand(final String value);

}
