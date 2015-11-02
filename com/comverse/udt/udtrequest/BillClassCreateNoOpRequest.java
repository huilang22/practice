/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassCreateNoOpRequest.java
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
 * NoOp class used to simulate a BillClassCreateNoOpRequest Udt Request/Response
 *
 */
public class BillClassCreateNoOpRequest extends BillClassSubRequestParent {
/**
 *
 * Constructor to create a   BillClassCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillClassCreateNoOpRequest(String id, BCObjectData noOpIn) {
    super(id, "BillClassCreateNoOpRequest");
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
