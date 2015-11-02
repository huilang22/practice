/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDeleteNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ServerDeleteNoOpRequest Udt Request/Response
 *
 */
public class ServerDeleteNoOpRequest extends ServerSubRequestParent {
/**
 *
 * Constructor to create a   ServerDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServerDeleteNoOpRequest(String id, ServerObjectData noOpIn) {
    super(id, "ServerDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("Server", ServerObjectHelper.toMap(noOpIn, new HashMap(), "Server").get("Server"));
    }
  }
/**
 *
 * Retrieves the ServerObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServerObjectData getOutput() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
}
