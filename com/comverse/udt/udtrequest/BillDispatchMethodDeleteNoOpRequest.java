/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BillDispatchMethodDeleteNoOpRequest Udt Request/Response
 *
 */
public class BillDispatchMethodDeleteNoOpRequest extends BillDispatchMethodSubRequestParent {
/**
 *
 * Constructor to create a   BillDispatchMethodDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillDispatchMethodDeleteNoOpRequest(String id, BillDispatchMethodObjectData noOpIn) {
    super(id, "BillDispatchMethodDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(noOpIn, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }
/**
 *
 * Retrieves the BillDispatchMethodObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillDispatchMethodObjectData getOutput() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
}
