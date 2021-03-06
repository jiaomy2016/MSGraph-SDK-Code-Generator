// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Requests\EntityRequestBuilder.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.Collections.Generic;
    using System.IO;

    /// <summary>
    /// The type OnenotePageRequestBuilder.
    /// </summary>
    public partial class OnenotePageRequestBuilder : EntityRequestBuilder, IOnenotePageRequestBuilder
    {

        /// <summary>
        /// Constructs a new OnenotePageRequestBuilder.
        /// </summary>
        /// <param name="requestUrl">The URL for the built request.</param>
        /// <param name="client">The <see cref="IBaseClient"/> for handling requests.</param>
        public OnenotePageRequestBuilder(
            string requestUrl,
            IBaseClient client)
            : base(requestUrl, client)
        {
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <returns>The built request.</returns>
        public new IOnenotePageRequest Request()
        {
            return this.Request(null);
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <param name="options">The query and header options for the request.</param>
        /// <returns>The built request.</returns>
        public new IOnenotePageRequest Request(IEnumerable<Option> options)
        {
            return new OnenotePageRequest(this.RequestUrl, this.Client, options);
        }
    
        /// <summary>
        /// Gets the request builder for Content.
        /// </summary>
        /// <returns>The <see cref="IOnenotePageContentRequestBuilder"/>.</returns>
        public IOnenotePageContentRequestBuilder Content
        {
            get
            {
                return new OnenotePageContentRequestBuilder(this.AppendSegmentToRequestUrl("content"), this.Client);
            }
        }
    
        /// <summary>
        /// Gets the request builder for OnenotePageForward.
        /// </summary>
        /// <returns>The <see cref="IOnenotePageForwardRequestBuilder"/>.</returns>
        public IOnenotePageForwardRequestBuilder Forward(
            IEnumerable<Recipient> ToRecipients,
            string Details = null,
            string Comment = null)
        {
            return new OnenotePageForwardRequestBuilder(
                this.AppendSegmentToRequestUrl("microsoft.graph.forward"),
                this.Client,
                ToRecipients,
                Details,
                Comment);
        }

        /// <summary>
        /// Gets the request builder for OnenotePageForward.
        /// </summary>
        /// <returns>The <see cref="IOnenotePageForwardRequestBuilder"/>.</returns>
        public IOnenotePageForwardRequestBuilder Forward(
            IEnumerable<Recipient> ToRecipients,
            string Comment = null)
        {
            return new OnenotePageForwardRequestBuilder(
                this.AppendSegmentToRequestUrl("microsoft.graph.forward"),
                this.Client,
                ToRecipients,
                Comment);
        }
    
    }
}
