/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupNoOpRequest.java
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
 * NoOp class used to simulate a CsrGroupNoOpRequest Udt Request/Response
 *
 */
public class CsrGroupNoOpRequest extends CsrSubRequestParent {
/**
 *
 * Constructor to create a   CsrGroupNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrGroupNoOpRequest(String id, CsrGroupOutputData noOpIn) {
    super(id, "CsrGroupNoOpRequest");
    if (noOpIn != null) {
      addInput("CsrGroupOutputData", CsrGroupOutputHelper.toMap(noOpIn).get("CsrGroupOutputData"));
    }
  }
/**
 *
 * Retrieves the CsrGroupOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupOutputData getOutput() {
    return CsrGroupOutputHelper.fromMap(outputMap);
  }
}
