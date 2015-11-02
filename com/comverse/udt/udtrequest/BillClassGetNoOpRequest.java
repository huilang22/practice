/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassGetNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a BillClassGetNoOpRequest Udt Request/Response
 *
 */
public class BillClassGetNoOpRequest extends BillClassSubRequestParent {
/**
 *
 * Constructor to create a   BillClassGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillClassGetNoOpRequest(String id, BCObjectData noOpIn) {
    super(id, "BillClassGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BillClass", BCObjectHelper.toMap(noOpIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }
/**
 *
 * Retrieves the BCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BCObjectData getOutput() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
}
