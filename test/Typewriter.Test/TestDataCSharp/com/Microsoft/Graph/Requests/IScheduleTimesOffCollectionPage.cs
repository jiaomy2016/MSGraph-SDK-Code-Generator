﻿// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Requests\IEntityCollectionPage.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.Text.Json.Serialization;

    /// <summary>
    /// The interface IScheduleTimesOffCollectionPage.
    /// </summary>
    [InterfaceConverter(typeof(InterfaceConverter<ScheduleTimesOffCollectionPage>))]
    public interface IScheduleTimesOffCollectionPage : ICollectionPage<TimeOff>
    {
        /// <summary>
        /// Gets the next page <see cref="IScheduleTimesOffCollectionRequest"/> instance.
        /// </summary>
        IScheduleTimesOffCollectionRequest NextPageRequest { get; }

        /// <summary>
        /// Initializes the NextPageRequest property.
        /// </summary>
        void InitializeNextPageRequest(IBaseClient client, string nextPageLinkString);
    }
}
