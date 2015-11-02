/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CsrGroupFunctionDeleteNoOpRequest Udt Request/Response
 *
 */
public class CsrGroupFunctionDeleteNoOpRequest extends CsrGroupFunctionSubRequestParent {
/**
 *
 * Constructor to create a   CsrGroupFunctionDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrGroupFunctionDeleteNoOpRequest(String id, CsrGroupFunctionObjectData noOpIn) {
    super(id, "CsrGroupFunctionDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(noOpIn, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }
/**
 *
 * Retrieves the CsrGroupFunctionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupFunctionObjectData getOutput() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
}
