/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LbxPaymentTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a LbxPaymentTypeGetNoOpRequest Udt Request/Response
 *
 */
public class LbxPaymentTypeGetNoOpRequest extends LbxPaymentTypeSubRequestParent {
/**
 *
 * Constructor to create a   LbxPaymentTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LbxPaymentTypeGetNoOpRequest(String id, LbxPaymentTypeObjectData noOpIn) {
    super(id, "LbxPaymentTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("LbxPaymentType", LbxPaymentTypeObjectHelper.toMap(noOpIn, new HashMap(), "LbxPaymentType").get("LbxPaymentType"));
    }
  }
/**
 *
 * Retrieves the LbxPaymentTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public LbxPaymentTypeObjectData getOutput() {
    return LbxPaymentTypeObjectHelper.fromMap(outputMap, "LbxPaymentType");
  }
}
