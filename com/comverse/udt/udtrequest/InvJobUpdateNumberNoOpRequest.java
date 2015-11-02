/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobUpdateNumberNoOpRequest.java
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
 * NoOp class used to simulate a InvJobUpdateNumberNoOpRequest Udt Request/Response
 *
 */
public class InvJobUpdateNumberNoOpRequest extends InvJobSubRequestParent {
/**
 *
 * Constructor to create a   InvJobUpdateNumberNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvJobUpdateNumberNoOpRequest(String id, InvJobObjectData noOpIn) {
    super(id, "InvJobUpdateNumberNoOpRequest");
    if (noOpIn != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(noOpIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }
/**
 *
 * Retrieves the InvJobObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobObjectData getOutput() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
}
