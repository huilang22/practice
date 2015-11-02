/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditCreateNoOpRequest.java
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
 * NoOp class used to simulate a PlanIdCreditCreateNoOpRequest Udt Request/Response
 *
 */
public class PlanIdCreditCreateNoOpRequest extends PlanIdCreditSubRequestParent {
/**
 *
 * Constructor to create a   PlanIdCreditCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PlanIdCreditCreateNoOpRequest(String id, PlanIdCreditObjectData noOpIn) {
    super(id, "PlanIdCreditCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(noOpIn, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }
/**
 *
 * Retrieves the PlanIdCreditObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PlanIdCreditObjectData getOutput() {
    return PlanIdCreditObjectHelper.fromMap(outputMap, "PlanIdCredit");
  }
}
