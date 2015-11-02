/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvokeNoOpRequest.java
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

import com.csgsystems.ai.data.*;

/**
 *
 * NoOp class used to simulate a InvokeNoOpRequest Udt Request/Response
 *
 */
public class InvokeNoOpRequest extends AISubRequestParent {
/**
 *
 * Constructor to create a   InvokeNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvokeNoOpRequest(String id, InvokeOutputData noOpIn) {
    super(id, "InvokeNoOpRequest");
    if (noOpIn != null) {
      addInput("InvokeOutputData", InvokeOutputHelper.toMap(noOpIn).get("InvokeOutputData"));
    }
  }
/**
 *
 * Retrieves the InvokeOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvokeOutputData getOutput() {
    return InvokeOutputHelper.fromMap(outputMap);
  }
}
