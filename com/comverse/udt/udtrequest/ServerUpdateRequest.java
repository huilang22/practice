/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerUpdateRequest.java
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
 * Class used to create a ServerUpdateRequest Udt Request
 *
 */

public class ServerUpdateRequest extends ServerSubRequestParent {
/**
 *
 * Constructor to create a  ServerUpdateRequest
 * @param id Unique request name
 * @param S_DUpdateIn ServerObjectData for ServerUpdateRequest
 *
 */
@JsonCreator
  public ServerUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Server")ServerObjectData S_DUpdateIn) {
    super(id, "ServerUpdate");
    if (S_DUpdateIn != null) {
      addInput("Server", ServerObjectHelper.toMap(S_DUpdateIn, new HashMap(), "Server").get("Server"));
    }
  }

/**
 *
 * Retrieves the ServerObjectData that results from the ServerUpdateRequest call
 * @return ServerObjectData resulting from udt call
 *
 */

  public ServerObjectData getOutput() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
}
