/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRefUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsInterfaceRefUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsInterfaceRefUpdateNoOpRequest extends InvsInterfaceRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsInterfaceRefUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsInterfaceRefUpdateNoOpRequest(String id, InvsInterfaceRefObjectData noOpIn) {
    super(id, "InvsInterfaceRefUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }
/**
 *
 * Retrieves the InvsInterfaceRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsInterfaceRefObjectData getOutput() {
    return InvsInterfaceRefObjectHelper.fromMap(outputMap, "InvsInterfaceRef");
  }
}
