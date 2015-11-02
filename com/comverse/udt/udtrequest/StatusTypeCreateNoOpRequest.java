/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a StatusTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class StatusTypeCreateNoOpRequest extends StatusTypeSubRequestParent {
/**
 *
 * Constructor to create a   StatusTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatusTypeCreateNoOpRequest(String id, StatusTypeObjectData noOpIn) {
    super(id, "StatusTypeCreateNoOpRequest");
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
