/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDeleteRequest.java
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
 * Class used to create a ServerDeleteRequest Udt Request
 *
 */

public class ServerDeleteRequest extends ServerSubRequestParent {
/**
 *
 * Constructor to create a  ServerDeleteRequest
 * @param id Unique request name
 * @param S_DDeleteIn ServerObjectKeyData for ServerDeleteRequest
 *
 */
@JsonCreator
  public ServerDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Server")ServerObjectKeyData S_DDeleteIn) {
    super(id, "ServerDelete");
    if (S_DDeleteIn != null) {
      addInput("Server", ServerObjectKeyHelper.toMap(S_DDeleteIn, new HashMap(), "ServerObjectKeyData").get("ServerObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServerObjectData that results from the ServerDeleteRequest call
 * @return ServerObjectData resulting from udt call
 *
 */

  public ServerObjectData getOutput() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
}
