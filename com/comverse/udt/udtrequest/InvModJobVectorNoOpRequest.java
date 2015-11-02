/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobVectorNoOpRequest.java
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
 * NoOp class used to simulate a InvModJobVectorNoOpRequest Udt Request/Response
 *
 */
public class InvModJobVectorNoOpRequest extends InvModJobSubRequestParent {
/**
 *
 * Constructor to create a   InvModJobVectorNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvModJobVectorNoOpRequest(String id, InvModJobVectorOutputData noOpIn) {
    super(id, "InvModJobVectorNoOpRequest");
    if (noOpIn != null) {
      addInput("InvModJobVectorOutputData", InvModJobVectorOutputHelper.toMap(noOpIn).get("InvModJobVectorOutputData"));
    }
  }
/**
 *
 * Retrieves the InvModJobVectorOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvModJobVectorOutputData getOutput() {
    return InvModJobVectorOutputHelper.fromMap(outputMap);
  }
}
