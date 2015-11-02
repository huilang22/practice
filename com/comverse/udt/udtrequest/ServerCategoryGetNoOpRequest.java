/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerCategoryGetNoOpRequest.java
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
 * NoOp class used to simulate a ServerCategoryGetNoOpRequest Udt Request/Response
 *
 */
public class ServerCategoryGetNoOpRequest extends ServerCategorySubRequestParent {
/**
 *
 * Constructor to create a   ServerCategoryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServerCategoryGetNoOpRequest(String id, SCObjectData noOpIn) {
    super(id, "ServerCategoryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ServerCategory", SCObjectHelper.toMap(noOpIn, new HashMap(), "ServerCategory").get("ServerCategory"));
    }
  }
/**
 *
 * Retrieves the SCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SCObjectData getOutput() {
    return SCObjectHelper.fromMap(outputMap, "ServerCategory");
  }
}
