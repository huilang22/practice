/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupMapGetNoOpRequest.java
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
 * NoOp class used to simulate a BillMessageGroupMapGetNoOpRequest Udt Request/Response
 *
 */
public class BillMessageGroupMapGetNoOpRequest extends BillMessageGroupMapSubRequestParent {
/**
 *
 * Constructor to create a   BillMessageGroupMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillMessageGroupMapGetNoOpRequest(String id, BillMessageGroupMapObjectData noOpIn) {
    super(id, "BillMessageGroupMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(noOpIn, new HashMap(), "BillMessageGroupMap").get("BillMessageGroupMap"));
    }
  }
/**
 *
 * Retrieves the BillMessageGroupMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillMessageGroupMapObjectData getOutput() {
    return BillMessageGroupMapObjectHelper.fromMap(outputMap, "BillMessageGroupMap");
  }
}
