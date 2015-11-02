/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImageGetNoOpRequest.java
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
 * NoOp class used to simulate a BillImageGetNoOpRequest Udt Request/Response
 *
 */
public class BillImageGetNoOpRequest extends BillImageSubRequestParent {
/**
 *
 * Constructor to create a   BillImageGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillImageGetNoOpRequest(String id, BillImageObjectData noOpIn) {
    super(id, "BillImageGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BillImage", BillImageObjectHelper.toMap(noOpIn, new HashMap(), "BillImage").get("BillImage"));
    }
  }
/**
 *
 * Retrieves the BillImageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillImageObjectData getOutput() {
    return BillImageObjectHelper.fromMap(outputMap, "BillImage");
  }
}
