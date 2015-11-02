/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusUpdateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a StatusUpdateNoOpRequest Udt Request/Response
 *
 */
public class StatusUpdateNoOpRequest extends StatusSubRequestParent {
/**
 *
 * Constructor to create a   StatusUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatusUpdateNoOpRequest(String id, StatusObjectData noOpIn) {
    super(id, "StatusUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Status", StatusObjectHelper.toMap(noOpIn, new HashMap(), "Status").get("Status"));
    }
  }
/**
 *
 * Retrieves the StatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public StatusObjectData getOutput() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
}
