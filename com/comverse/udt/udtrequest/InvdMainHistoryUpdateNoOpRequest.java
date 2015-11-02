/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvdMainHistoryUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvdMainHistoryUpdateNoOpRequest extends InvdMainHistorySubRequestParent {
/**
 *
 * Constructor to create a   InvdMainHistoryUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdMainHistoryUpdateNoOpRequest(String id, InvdMainHistoryObjectData noOpIn) {
    super(id, "InvdMainHistoryUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(noOpIn, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }
/**
 *
 * Retrieves the InvdMainHistoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainHistoryObjectData getOutput() {
    return InvdMainHistoryObjectHelper.fromMap(outputMap, "InvdMainHistory");
  }
}
