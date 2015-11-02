/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileCreateNoOpRequest.java
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
 * NoOp class used to simulate a AxrtPaymentProfileCreateNoOpRequest Udt Request/Response
 *
 */
public class AxrtPaymentProfileCreateNoOpRequest extends AxrtPaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a   AxrtPaymentProfileCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AxrtPaymentProfileCreateNoOpRequest(String id, AxrtPaymentProfileObjectData noOpIn) {
    super(id, "AxrtPaymentProfileCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(noOpIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }
/**
 *
 * Retrieves the AxrtPaymentProfileObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentProfileObjectData getOutput() {
    return AxrtPaymentProfileObjectHelper.fromMap(outputMap, "AxrtPaymentProfile");
  }
}
