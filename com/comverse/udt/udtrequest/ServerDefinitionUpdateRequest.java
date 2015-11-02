/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionUpdateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServerDefinitionUpdateRequest Udt Request
 *
 */

public class ServerDefinitionUpdateRequest extends ServerDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  ServerDefinitionUpdateRequest
 * @param id Unique request name
 * @param SDUpdateIn ServerDefinitionObjectData for ServerDefinitionUpdateRequest
 *
 */
@JsonCreator
  public ServerDefinitionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServerDefinition")ServerDefinitionObjectData SDUpdateIn) {
    super(id, "ServerDefinitionUpdate");
    if (SDUpdateIn != null) {
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(SDUpdateIn, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }

/**
 *
 * Retrieves the ServerDefinitionObjectData that results from the ServerDefinitionUpdateRequest call
 * @return ServerDefinitionObjectData resulting from udt call
 *
 */

  public ServerDefinitionObjectData getOutput() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
}
