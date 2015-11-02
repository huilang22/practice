/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionCreateNoOpRequest.java
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
 * NoOp class used to simulate a ServerDefinitionCreateNoOpRequest Udt Request/Response
 *
 */
public class ServerDefinitionCreateNoOpRequest extends ServerDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   ServerDefinitionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServerDefinitionCreateNoOpRequest(String id, ServerDefinitionObjectData noOpIn) {
    super(id, "ServerDefinitionCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }
/**
 *
 * Retrieves the ServerDefinitionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServerDefinitionObjectData getOutput() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
}
