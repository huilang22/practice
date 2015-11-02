/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvHistoryCreateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvHistoryCreateNoOpRequest Udt Request/Response
 *
 */
public class InvHistoryCreateNoOpRequest extends InvHistorySubRequestParent {
/**
 *
 * Constructor to create a   InvHistoryCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvHistoryCreateNoOpRequest(String id, InvHistoryObjectData noOpIn) {
    super(id, "InvHistoryCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvHistory", InvHistoryObjectHelper.toMap(noOpIn, new HashMap(), "InvHistory").get("InvHistory"));
    }
  }
/**
 *
 * Retrieves the InvHistoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvHistoryObjectData getOutput() {
    return InvHistoryObjectHelper.fromMap(outputMap, "InvHistory");
  }
}
