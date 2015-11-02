/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementSwapNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvElementSwapNoOpRequest Udt Request/Response
 *
 */
public class InvElementSwapNoOpRequest extends InvElementSubRequestParent {
/**
 *
 * Constructor to create a   InvElementSwapNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvElementSwapNoOpRequest(String id, InvElementSwapOutputData noOpIn) {
    super(id, "InvElementSwapNoOpRequest");
    if (noOpIn != null) {
      addInput("InvElementSwapOutputData", InvElementSwapOutputHelper.toMap(noOpIn).get("InvElementSwapOutputData"));
    }
  }
/**
 *
 * Retrieves the InvElementSwapOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementSwapOutputData getOutput() {
    return InvElementSwapOutputHelper.fromMap(outputMap);
  }
}
