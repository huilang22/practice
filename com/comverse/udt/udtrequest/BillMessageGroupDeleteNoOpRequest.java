/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BillMessageGroupDeleteNoOpRequest Udt Request/Response
 *
 */
public class BillMessageGroupDeleteNoOpRequest extends BillMessageGroupSubRequestParent {
/**
 *
 * Constructor to create a   BillMessageGroupDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillMessageGroupDeleteNoOpRequest(String id, BillMessageGroupObjectData noOpIn) {
    super(id, "BillMessageGroupDeleteNoOpRequest");
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
