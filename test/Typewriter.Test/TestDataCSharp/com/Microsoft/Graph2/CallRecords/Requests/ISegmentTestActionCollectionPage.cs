// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Requests\IMethodCollectionPage.cs.tt

namespace Microsoft.Graph2.CallRecords
{
    using Newtonsoft.Json;

    /// <summary>
    /// The interface ISegmentTestActionCollectionPage.
    /// </summary>
    [JsonConverter(typeof(Microsoft.Graph.InterfaceConverter<SegmentTestActionCollectionPage>))]
    public interface ISegmentTestActionCollectionPage : Microsoft.Graph.ICollectionPage<Session>
    {
        /// <summary>
        /// Gets the next page <see cref="ISegmentTestActionRequest"/> instance.
        /// </summary>
        ISegmentTestActionRequest NextPageRequest { get; }

        /// <summary>
        /// Initializes the NextPageRequest property.
        /// </summary>
        void InitializeNextPageRequest(Microsoft.Graph.IBaseClient client, string nextPageLinkString);
    }
}
