/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistoryGetNoOpRequest.java
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
 * NoOp class used to simulate a InvJobHistoryGetNoOpRequest Udt Request/Response
 *
 */
public class InvJobHistoryGetNoOpRequest extends InvJobHistorySubRequestParent {
/**
 *
 * Constructor to create a   InvJobHistoryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvJobHistoryGetNoOpRequest(String id, InvJobHistoryObjectData noOpIn) {
    super(id, "InvJobHistoryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvJobHistory", InvJobHistoryObjectHelper.toMap(noOpIn, new HashMap(), "InvJobHistory").get("InvJobHistory"));
    }
  }
/**
 *
 * Retrieves the InvJobHistoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobHistoryObjectData getOutput() {
    return InvJobHistoryObjectHelper.fromMap(outputMap, "InvJobHistory");
  }
}
