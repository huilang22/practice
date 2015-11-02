/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionCreateNoOpRequest.java
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
 * NoOp class used to simulate a CsrGroupFunctionCreateNoOpRequest Udt Request/Response
 *
 */
public class CsrGroupFunctionCreateNoOpRequest extends CsrGroupFunctionSubRequestParent {
/**
 *
 * Constructor to create a   CsrGroupFunctionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrGroupFunctionCreateNoOpRequest(String id, CsrGroupFunctionObjectData noOpIn) {
    super(id, "CsrGroupFunctionCreateNoOpRequest");
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
