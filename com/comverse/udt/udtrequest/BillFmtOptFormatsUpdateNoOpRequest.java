/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BillFmtOptFormatsUpdateNoOpRequest Udt Request/Response
 *
 */
public class BillFmtOptFormatsUpdateNoOpRequest extends BillFmtOptFormatsSubRequestParent {
/**
 *
 * Constructor to create a   BillFmtOptFormatsUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillFmtOptFormatsUpdateNoOpRequest(String id, BillFmtOptFormatsObjectData noOpIn) {
    super(id, "BillFmtOptFormatsUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(noOpIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }
/**
 *
 * Retrieves the BillFmtOptFormatsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillFmtOptFormatsObjectData getOutput() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
}
