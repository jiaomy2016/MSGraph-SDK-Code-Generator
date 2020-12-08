// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Model\EnumType.cs.tt


namespace Microsoft.Graph2.CallRecords
{
    using System;
    using Newtonsoft.Json;

    /// <summary>
    /// The enum MediaStreamDirection.
    /// </summary>
    [JsonConverter(typeof(Microsoft.Graph.EnumConverter))]
    public enum MediaStreamDirection
    {
    
        /// <summary>
        /// Caller To Callee
        /// </summary>
        CallerToCallee = 0,
	
        /// <summary>
        /// Callee To Caller
        /// </summary>
        CalleeToCaller = 1,
	
    }
}
