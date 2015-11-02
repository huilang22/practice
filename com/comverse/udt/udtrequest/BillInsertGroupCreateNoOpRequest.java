/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupCreateNoOpRequest.java
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
 * NoOp class used to simulate a BillInsertGroupCreateNoOpRequest Udt Request/Response
 *
 */
public class BillInsertGroupCreateNoOpRequest extends BillInsertGroupSubRequestParent {
/**
 *
 * Constructor to create a   BillInsertGroupCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillInsertGroupCreateNoOpRequest(String id, BillInsertGroupObjectData noOpIn) {
    super(id, "BillInsertGroupCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(noOpIn, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }
/**
 *
 * Retrieves the BillInsertGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupObjectData getOutput() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
}
