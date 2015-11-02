/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerCreateRequest.java
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
 * Class used to create a ServerCreateRequest Udt Request
 *
 */

public class ServerCreateRequest extends ServerSubRequestParent {
/**
 *
 * Constructor to create a  ServerCreateRequest
 * @param id Unique request name
 * @param S_DCreateIn ServerObjectData for ServerCreateRequest
 *
 */
@JsonCreator
  public ServerCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Server")ServerObjectData S_DCreateIn) {
    super(id, "ServerCreate");
    if (S_DCreateIn != null) {
      addInput("Server", ServerObjectHelper.toMap(S_DCreateIn, new HashMap(), "Server").get("Server"));
    }
  }

/**
 *
 * Retrieves the ServerObjectData that results from the ServerCreateRequest call
 * @return ServerObjectData resulting from udt call
 *
 */

  public ServerObjectData getOutput() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
}
