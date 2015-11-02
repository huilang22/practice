/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionGetRequest.java
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
 * Class used to create a ServerDefinitionGetRequest Udt Request
 *
 */

public class ServerDefinitionGetRequest extends ServerDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  ServerDefinitionGetRequest
 * @param id Unique request name
 * @param SDGetIn ServerDefinitionObjectKeyData for ServerDefinitionGetRequest
 *
 */
@JsonCreator
  public ServerDefinitionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServerDefinition")ServerDefinitionObjectKeyData SDGetIn) {
    super(id, "ServerDefinitionGet");
    if (SDGetIn != null) {
      addInput("ServerDefinition", ServerDefinitionObjectKeyHelper.toMap(SDGetIn, new HashMap(), "ServerDefinitionObjectKeyData").get("ServerDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServerDefinitionObjectData that results from the ServerDefinitionGetRequest call
 * @return ServerDefinitionObjectData resulting from udt call
 *
 */

  public ServerDefinitionObjectData getOutput() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
}
