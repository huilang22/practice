/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CsrGroupAmountUpdateNoOpRequest Udt Request/Response
 *
 */
public class CsrGroupAmountUpdateNoOpRequest extends CsrGroupAmountSubRequestParent {
/**
 *
 * Constructor to create a   CsrGroupAmountUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrGroupAmountUpdateNoOpRequest(String id, CsrGroupAmountObjectData noOpIn) {
    super(id, "CsrGroupAmountUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(noOpIn, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }
/**
 *
 * Retrieves the CsrGroupAmountObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupAmountObjectData getOutput() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
}
