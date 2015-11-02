/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionContigSelectNumsNoOpRequest.java
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
 * NoOp class used to simulate a InvAutoActionContigSelectNumsNoOpRequest Udt Request/Response
 *
 */
public class InvAutoActionContigSelectNumsNoOpRequest extends InvAutoActionSubRequestParent {
/**
 *
 * Constructor to create a   InvAutoActionContigSelectNumsNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvAutoActionContigSelectNumsNoOpRequest(String id, InvAutoActionContigSelectNumsOutputData noOpIn) {
    super(id, "InvAutoActionContigSelectNumsNoOpRequest");
    if (noOpIn != null) {
      addInput("InvAutoActionContigSelectNumsOutputData", InvAutoActionContigSelectNumsOutputHelper.toMap(noOpIn).get("InvAutoActionContigSelectNumsOutputData"));
    }
  }
/**
 *
 * Retrieves the InvAutoActionContigSelectNumsOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvAutoActionContigSelectNumsOutputData getOutput() {
    return InvAutoActionContigSelectNumsOutputHelper.fromMap(outputMap);
  }
}
