/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditUpdateNoOpRequest.java
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
 * NoOp class used to simulate a PlanIdCreditUpdateNoOpRequest Udt Request/Response
 *
 */
public class PlanIdCreditUpdateNoOpRequest extends PlanIdCreditSubRequestParent {
/**
 *
 * Constructor to create a   PlanIdCreditUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PlanIdCreditUpdateNoOpRequest(String id, PlanIdCreditObjectData noOpIn) {
    super(id, "PlanIdCreditUpdateNoOpRequest");
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
