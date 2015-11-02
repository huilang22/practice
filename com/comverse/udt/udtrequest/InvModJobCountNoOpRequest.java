/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobCountNoOpRequest.java
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
 * NoOp class used to simulate a InvModJobCountNoOpRequest Udt Request/Response
 *
 */
public class InvModJobCountNoOpRequest extends InvModJobSubRequestParent {
/**
 *
 * Constructor to create a   InvModJobCountNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvModJobCountNoOpRequest(String id, InvModJobCountOutputData noOpIn) {
    super(id, "InvModJobCountNoOpRequest");
    if (noOpIn != null) {
      addInput("InvModJobCountOutputData", InvModJobCountOutputHelper.toMap(noOpIn).get("InvModJobCountOutputData"));
    }
  }
/**
 *
 * Retrieves the InvModJobCountOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvModJobCountOutputData getOutput() {
    return InvModJobCountOutputHelper.fromMap(outputMap);
  }
}
