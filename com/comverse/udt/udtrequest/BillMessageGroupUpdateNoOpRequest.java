/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BillMessageGroupUpdateNoOpRequest Udt Request/Response
 *
 */
public class BillMessageGroupUpdateNoOpRequest extends BillMessageGroupSubRequestParent {
/**
 *
 * Constructor to create a   BillMessageGroupUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillMessageGroupUpdateNoOpRequest(String id, BillMessageGroupObjectData noOpIn) {
    super(id, "BillMessageGroupUpdateNoOpRequest");
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
