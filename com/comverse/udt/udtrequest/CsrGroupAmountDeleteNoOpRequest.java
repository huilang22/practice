/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CsrGroupAmountDeleteNoOpRequest Udt Request/Response
 *
 */
public class CsrGroupAmountDeleteNoOpRequest extends CsrGroupAmountSubRequestParent {
/**
 *
 * Constructor to create a   CsrGroupAmountDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrGroupAmountDeleteNoOpRequest(String id, CsrGroupAmountObjectData noOpIn) {
    super(id, "CsrGroupAmountDeleteNoOpRequest");
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
