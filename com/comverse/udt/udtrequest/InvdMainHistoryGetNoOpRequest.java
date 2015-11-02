/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryGetNoOpRequest.java
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
 * NoOp class used to simulate a InvdMainHistoryGetNoOpRequest Udt Request/Response
 *
 */
public class InvdMainHistoryGetNoOpRequest extends InvdMainHistorySubRequestParent {
/**
 *
 * Constructor to create a   InvdMainHistoryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdMainHistoryGetNoOpRequest(String id, InvdMainHistoryObjectData noOpIn) {
    super(id, "InvdMainHistoryGetNoOpRequest");
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
