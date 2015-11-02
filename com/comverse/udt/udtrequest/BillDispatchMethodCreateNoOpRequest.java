/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodCreateNoOpRequest.java
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
 * NoOp class used to simulate a BillDispatchMethodCreateNoOpRequest Udt Request/Response
 *
 */
public class BillDispatchMethodCreateNoOpRequest extends BillDispatchMethodSubRequestParent {
/**
 *
 * Constructor to create a   BillDispatchMethodCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillDispatchMethodCreateNoOpRequest(String id, BillDispatchMethodObjectData noOpIn) {
    super(id, "BillDispatchMethodCreateNoOpRequest");
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
