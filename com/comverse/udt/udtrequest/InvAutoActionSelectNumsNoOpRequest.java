/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionSelectNumsNoOpRequest.java
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
 * NoOp class used to simulate a InvAutoActionSelectNumsNoOpRequest Udt Request/Response
 *
 */
public class InvAutoActionSelectNumsNoOpRequest extends InvAutoActionSubRequestParent {
/**
 *
 * Constructor to create a   InvAutoActionSelectNumsNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvAutoActionSelectNumsNoOpRequest(String id, InvAutoActionSelectNumsOutputData noOpIn) {
    super(id, "InvAutoActionSelectNumsNoOpRequest");
    if (noOpIn != null) {
      addInput("InvAutoActionSelectNumsOutputData", InvAutoActionSelectNumsOutputHelper.toMap(noOpIn).get("InvAutoActionSelectNumsOutputData"));
    }
  }
/**
 *
 * Retrieves the InvAutoActionSelectNumsOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvAutoActionSelectNumsOutputData getOutput() {
    return InvAutoActionSelectNumsOutputHelper.fromMap(outputMap);
  }
}
