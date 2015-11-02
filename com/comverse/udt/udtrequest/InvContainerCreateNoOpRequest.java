/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvContainerCreateNoOpRequest Udt Request/Response
 *
 */
public class InvContainerCreateNoOpRequest extends InvContainerSubRequestParent {
/**
 *
 * Constructor to create a   InvContainerCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvContainerCreateNoOpRequest(String id, InvContainerObjectData noOpIn) {
    super(id, "InvContainerCreateNoOpRequest");
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
