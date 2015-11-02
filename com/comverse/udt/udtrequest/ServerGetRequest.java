/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerGetRequest.java
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
 * Class used to create a ServerGetRequest Udt Request
 *
 */

public class ServerGetRequest extends ServerSubRequestParent {
/**
 *
 * Constructor to create a  ServerGetRequest
 * @param id Unique request name
 * @param S_DGetIn ServerObjectKeyData for ServerGetRequest
 *
 */
@JsonCreator
  public ServerGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Server")ServerObjectKeyData S_DGetIn) {
    super(id, "ServerGet");
    if (S_DGetIn != null) {
      addInput("Server", ServerObjectKeyHelper.toMap(S_DGetIn, new HashMap(), "ServerObjectKeyData").get("ServerObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServerObjectData that results from the ServerGetRequest call
 * @return ServerObjectData resulting from udt call
 *
 */

  public ServerObjectData getOutput() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
}
