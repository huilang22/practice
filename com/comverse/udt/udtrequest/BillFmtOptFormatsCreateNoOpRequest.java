/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsCreateNoOpRequest.java
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
 * NoOp class used to simulate a BillFmtOptFormatsCreateNoOpRequest Udt Request/Response
 *
 */
public class BillFmtOptFormatsCreateNoOpRequest extends BillFmtOptFormatsSubRequestParent {
/**
 *
 * Constructor to create a   BillFmtOptFormatsCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillFmtOptFormatsCreateNoOpRequest(String id, BillFmtOptFormatsObjectData noOpIn) {
    super(id, "BillFmtOptFormatsCreateNoOpRequest");
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
