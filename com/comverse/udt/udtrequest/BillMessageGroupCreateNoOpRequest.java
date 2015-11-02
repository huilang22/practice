/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupCreateNoOpRequest.java
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
 * NoOp class used to simulate a BillMessageGroupCreateNoOpRequest Udt Request/Response
 *
 */
public class BillMessageGroupCreateNoOpRequest extends BillMessageGroupSubRequestParent {
/**
 *
 * Constructor to create a   BillMessageGroupCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillMessageGroupCreateNoOpRequest(String id, BillMessageGroupObjectData noOpIn) {
    super(id, "BillMessageGroupCreateNoOpRequest");
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
