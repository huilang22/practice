/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AxrtPaymentProfileUpdateNoOpRequest Udt Request/Response
 *
 */
public class AxrtPaymentProfileUpdateNoOpRequest extends AxrtPaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a   AxrtPaymentProfileUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AxrtPaymentProfileUpdateNoOpRequest(String id, AxrtPaymentProfileObjectData noOpIn) {
    super(id, "AxrtPaymentProfileUpdateNoOpRequest");
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
