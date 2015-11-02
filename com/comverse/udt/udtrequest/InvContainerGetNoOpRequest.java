/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerGetNoOpRequest.java
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
 * NoOp class used to simulate a InvContainerGetNoOpRequest Udt Request/Response
 *
 */
public class InvContainerGetNoOpRequest extends InvContainerSubRequestParent {
/**
 *
 * Constructor to create a   InvContainerGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvContainerGetNoOpRequest(String id, InvContainerObjectData noOpIn) {
    super(id, "InvContainerGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(noOpIn, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }
/**
 *
 * Retrieves the InvContainerObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerObjectData getOutput() {
    return InvContainerObjectHelper.fromMap(outputMap, "InvContainer");
  }
}
