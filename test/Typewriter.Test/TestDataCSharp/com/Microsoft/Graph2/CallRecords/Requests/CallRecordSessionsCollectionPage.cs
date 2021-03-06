// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Requests\EntityCollectionPage.cs.tt

namespace Microsoft.Graph2.CallRecords
{
    using System;

    /// <summary>
    /// The type CallRecordSessionsCollectionPage.
    /// </summary>
    public partial class CallRecordSessionsCollectionPage : Microsoft.Graph.CollectionPage<Session>, ICallRecordSessionsCollectionPage
    {
        /// <summary>
        /// Gets the next page <see cref="ICallRecordSessionsCollectionRequest"/> instance.
        /// </summary>
        public ICallRecordSessionsCollectionRequest NextPageRequest { get; private set; }

        /// <summary>
        /// Initializes the NextPageRequest property.
        /// </summary>
        public void InitializeNextPageRequest(Microsoft.Graph.IBaseClient client, string nextPageLinkString)
        {
            if (!string.IsNullOrEmpty(nextPageLinkString))
            {
                this.NextPageRequest = new CallRecordSessionsCollectionRequest(
                    nextPageLinkString,
                    client,
                    null);
            }
        }
    }
}
