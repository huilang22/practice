/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobsubstateGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsJobsubstateGetNoOpRequest Udt Request/Response
 *
 */
public class InvsJobsubstateGetNoOpRequest extends InvsJobsubstateSubRequestParent {
/**
 *
 * Constructor to create a   InvsJobsubstateGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsJobsubstateGetNoOpRequest(String id, InvsJobsubstateObjectData noOpIn) {
    super(id, "InvsJobsubstateGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsJobsubstate", InvsJobsubstateObjectHelper.toMap(noOpIn, new HashMap(), "InvsJobsubstate").get("InvsJobsubstate"));
    }
  }
/**
 *
 * Retrieves the InvsJobsubstateObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobsubstateObjectData getOutput() {
    return InvsJobsubstateObjectHelper.fromMap(outputMap, "InvsJobsubstate");
  }
}
