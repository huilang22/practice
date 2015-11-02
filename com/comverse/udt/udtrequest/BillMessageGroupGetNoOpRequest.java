/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a BillMessageGroupGetNoOpRequest Udt Request/Response
 *
 */
public class BillMessageGroupGetNoOpRequest extends BillMessageGroupSubRequestParent {
/**
 *
 * Constructor to create a   BillMessageGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillMessageGroupGetNoOpRequest(String id, BillMessageGroupObjectData noOpIn) {
    super(id, "BillMessageGroupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(noOpIn, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }
/**
 *
 * Retrieves the BillMessageGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillMessageGroupObjectData getOutput() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
}
