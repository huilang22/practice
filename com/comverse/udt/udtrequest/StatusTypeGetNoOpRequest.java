/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a StatusTypeGetNoOpRequest Udt Request/Response
 *
 */
public class StatusTypeGetNoOpRequest extends StatusTypeSubRequestParent {
/**
 *
 * Constructor to create a   StatusTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatusTypeGetNoOpRequest(String id, StatusTypeObjectData noOpIn) {
    super(id, "StatusTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("StatusType", StatusTypeObjectHelper.toMap(noOpIn, new HashMap(), "StatusType").get("StatusType"));
    }
  }
/**
 *
 * Retrieves the StatusTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public StatusTypeObjectData getOutput() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
}
