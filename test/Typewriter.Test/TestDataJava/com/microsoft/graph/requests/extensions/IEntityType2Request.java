// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EntityType2;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Entity Type2Request.
 */
public interface IEntityType2Request extends IHttpRequest {

    /**
     * Gets the EntityType2 from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EntityType2> callback);

    /**
     * Gets the EntityType2 from the service
     *
     * @return the EntityType2 from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntityType2 get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<EntityType2> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EntityType2 with a source
     *
     * @param sourceEntityType2 the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EntityType2 sourceEntityType2, final ICallback<EntityType2> callback);

    /**
     * Patches this EntityType2 with a source
     *
     * @param sourceEntityType2 the source object with updates
     * @return the updated EntityType2
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntityType2 patch(final EntityType2 sourceEntityType2) throws ClientException;

    /**
     * Posts a EntityType2 with a new object
     *
     * @param newEntityType2 the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EntityType2 newEntityType2, final ICallback<EntityType2> callback);

    /**
     * Posts a EntityType2 with a new object
     *
     * @param newEntityType2 the new object to create
     * @return the created EntityType2
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntityType2 post(final EntityType2 newEntityType2) throws ClientException;

    /**
     * Posts a EntityType2 with a new object
     *
     * @param newEntityType2 the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EntityType2 newEntityType2, final ICallback<EntityType2> callback);

    /**
     * Posts a EntityType2 with a new object
     *
     * @param newEntityType2 the object to create/update
     * @return the created EntityType2
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntityType2 put(final EntityType2 newEntityType2) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEntityType2Request select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEntityType2Request expand(final String value);

}
