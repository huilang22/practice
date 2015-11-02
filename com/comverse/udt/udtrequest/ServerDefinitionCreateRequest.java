/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionCreateRequest.java
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
 * Class used to create a ServerDefinitionCreateRequest Udt Request
 *
 */

public class ServerDefinitionCreateRequest extends ServerDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  ServerDefinitionCreateRequest
 * @param id Unique request name
 * @param SDCreateIn ServerDefinitionObjectData for ServerDefinitionCreateRequest
 *
 */
@JsonCreator
  public ServerDefinitionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServerDefinition")ServerDefinitionObjectData SDCreateIn) {
    super(id, "ServerDefinitionCreate");
    if (SDCreateIn != null) {
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(SDCreateIn, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }

/**
 *
 * Retrieves the ServerDefinitionObjectData that results from the ServerDefinitionCreateRequest call
 * @return ServerDefinitionObjectData resulting from udt call
 *
 */

  public ServerDefinitionObjectData getOutput() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
}
