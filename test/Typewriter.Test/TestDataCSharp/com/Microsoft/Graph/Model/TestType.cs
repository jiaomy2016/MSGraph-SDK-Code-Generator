// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Model\EntityType.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Runtime.Serialization;
    using Newtonsoft.Json;

    /// <summary>
    /// The type Test Type.
    /// </summary>
    [JsonObject(MemberSerialization = MemberSerialization.OptIn)]
    public partial class TestType : Entity
    {
    
		///<summary>
		/// The TestType constructor
		///</summary>
        public TestType()
        {
            this.ODataType = "microsoft.graph.testType";
        }
	
        /// <summary>
        /// Gets or sets property alpha.
        /// </summary>
        [Obsolete("emptyBaseComplexTypeRequest is deprecated. Please use emptyBaseComplexTypeRequest2.")]
        [JsonProperty(NullValueHandling = NullValueHandling.Ignore, PropertyName = "propertyAlpha", Required = Newtonsoft.Json.Required.Default)]
        public DerivedComplexTypeRequestObject PropertyAlpha { get; set; }
    
    }
}

