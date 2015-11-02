/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsInterfaceUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsInterfaceUpdateNoOpRequest extends InvsInterfaceSubRequestParent {
/**
 *
 * Constructor to create a   InvsInterfaceUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsInterfaceUpdateNoOpRequest(String id, InvsInterfaceObjectData noOpIn) {
    super(id, "InvsInterfaceUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(noOpIn, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }
/**
 *
 * Retrieves the InvsInterfaceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsInterfaceObjectData getOutput() {
    return InvsInterfaceObjectHelper.fromMap(outputMap, "InvsInterface");
  }
}
