/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMccCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsMccCodeGetNoOpRequest Udt Request/Response
 *
 */
public class InvsMccCodeGetNoOpRequest extends InvsMccCodeSubRequestParent {
/**
 *
 * Constructor to create a   InvsMccCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsMccCodeGetNoOpRequest(String id, InvsMccCodeObjectData noOpIn) {
    super(id, "InvsMccCodeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(noOpIn, new HashMap(), "InvsMccCode").get("InvsMccCode"));
    }
  }
/**
 *
 * Retrieves the InvsMccCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsMccCodeObjectData getOutput() {
    return InvsMccCodeObjectHelper.fromMap(outputMap, "InvsMccCode");
  }
}
