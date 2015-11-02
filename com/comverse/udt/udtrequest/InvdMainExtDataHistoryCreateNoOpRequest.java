/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvdMainExtDataHistoryCreateNoOpRequest Udt Request/Response
 *
 */
public class InvdMainExtDataHistoryCreateNoOpRequest extends InvdMainExtDataHistorySubRequestParent {
/**
 *
 * Constructor to create a   InvdMainExtDataHistoryCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdMainExtDataHistoryCreateNoOpRequest(String id, InvdMainExtDataHistoryObjectData noOpIn) {
    super(id, "InvdMainExtDataHistoryCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(noOpIn, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }
/**
 *
 * Retrieves the InvdMainExtDataHistoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainExtDataHistoryObjectData getOutput() {
    return InvdMainExtDataHistoryObjectHelper.fromMap(outputMap, "InvdMainExtDataHistory");
  }
}
