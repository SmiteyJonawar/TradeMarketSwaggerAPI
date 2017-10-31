/*
 * Webservices
 *
 * barrow
 *
 * OpenAPI spec version: v1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using Swashbuckle.SwaggerGen.Annotations;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    public class MemberApiController : Controller
    { 

        /// <summary>
        /// Add member to database
        /// </summary>
        /// <remarks>This is an example of how the JSON should be structured             {                 \&quot;email\&quot; : \&quot;john@mail.com\&quot;,                 \&quot;firstName\&quot; : \&quot;Benny\&quot;,                 \&quot;lastName\&quot; : \&quot;Bensen\&quot;,                 \&quot;address\&quot; : \&quot;jørgenvej 21\&quot;,                 \&quot;phoneNumber\&quot; : \&quot;+45 21 21 21 21\&quot;,                 \&quot;age\&quot; : 21,                 \&quot;password\&quot; : \&quot;suicune\&quot;,                 \&quot;id\&quot; : 1             }</remarks>
        /// <param name="who">Who to say hello to</param>
        /// <response code="200">OK</response>
        [HttpPost]
        [Route("/Jonawar/HelloWorldBuNoGoodbye/v1/member/add")]
        [SwaggerOperation("AddMember")]
        [SwaggerResponse(200, type: typeof(Member))]
        public virtual IActionResult AddMember([FromBody]Member who)
        { 
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Member>(exampleJson)
            : default(Member);
            return new ObjectResult(example);
        }
    }
}
