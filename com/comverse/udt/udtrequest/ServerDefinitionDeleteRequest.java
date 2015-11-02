/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionDeleteRequest.java
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
 * Class used to create a ServerDefinitionDeleteRequest Udt Request
 *
 */

public class ServerDefinitionDeleteRequest extends ServerDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  ServerDefinitionDeleteRequest
 * @param id Unique request name
 * @param SDDeleteIn ServerDefinitionObjectKeyData for ServerDefinitionDeleteRequest
 *
 */
@JsonCreator
  public ServerDefinitionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServerDefinition")ServerDefinitionObjectKeyData SDDeleteIn) {
    super(id, "ServerDefinitionDelete");
    if (SDDeleteIn != null) {
      addInput("ServerDefinition", ServerDefinitionObjectKeyHelper.toMap(SDDeleteIn, new HashMap(), "ServerDefinitionObjectKeyData").get("ServerDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServerDefinitionObjectData that results from the ServerDefinitionDeleteRequest call
 * @return ServerDefinitionObjectData resulting from udt call
 *
 */

  public ServerDefinitionObjectData getOutput() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
}
