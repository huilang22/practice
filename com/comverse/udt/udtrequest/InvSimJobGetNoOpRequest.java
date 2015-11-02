/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobGetNoOpRequest.java
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
 * NoOp class used to simulate a InvSimJobGetNoOpRequest Udt Request/Response
 *
 */
public class InvSimJobGetNoOpRequest extends InvSimJobSubRequestParent {
/**
 *
 * Constructor to create a   InvSimJobGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvSimJobGetNoOpRequest(String id, InvSimJobObjectData noOpIn) {
    super(id, "InvSimJobGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(noOpIn, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }
/**
 *
 * Retrieves the InvSimJobObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimJobObjectData getOutput() {
    return InvSimJobObjectHelper.fromMap(outputMap, "InvSimJob");
  }
}
