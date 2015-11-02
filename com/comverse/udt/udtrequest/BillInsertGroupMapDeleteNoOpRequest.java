/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BillInsertGroupMapDeleteNoOpRequest Udt Request/Response
 *
 */
public class BillInsertGroupMapDeleteNoOpRequest extends BillInsertGroupMapSubRequestParent {
/**
 *
 * Constructor to create a   BillInsertGroupMapDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillInsertGroupMapDeleteNoOpRequest(String id, BillInsertGroupMapObjectData noOpIn) {
    super(id, "BillInsertGroupMapDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(noOpIn, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }
/**
 *
 * Retrieves the BillInsertGroupMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupMapObjectData getOutput() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
}
