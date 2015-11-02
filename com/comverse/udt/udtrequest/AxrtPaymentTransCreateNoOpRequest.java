/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentTransCreateNoOpRequest.java
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
 * NoOp class used to simulate a AxrtPaymentTransCreateNoOpRequest Udt Request/Response
 *
 */
public class AxrtPaymentTransCreateNoOpRequest extends AxrtPaymentTransSubRequestParent {
/**
 *
 * Constructor to create a   AxrtPaymentTransCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AxrtPaymentTransCreateNoOpRequest(String id, AxrtPaymentTransObjectData noOpIn) {
    super(id, "AxrtPaymentTransCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AxrtPaymentTrans", AxrtPaymentTransObjectHelper.toMap(noOpIn, new HashMap(), "AxrtPaymentTrans").get("AxrtPaymentTrans"));
    }
  }
/**
 *
 * Retrieves the AxrtPaymentTransObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentTransObjectData getOutput() {
    return AxrtPaymentTransObjectHelper.fromMap(outputMap, "AxrtPaymentTrans");
  }
}
