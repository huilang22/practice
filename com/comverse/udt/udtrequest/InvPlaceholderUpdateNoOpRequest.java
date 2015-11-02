/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderUpdateNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a InvPlaceholderUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvPlaceholderUpdateNoOpRequest extends InvPlaceholderSubRequestParent {
/**
 *
 * Constructor to create a   InvPlaceholderUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvPlaceholderUpdateNoOpRequest(String id, InvPlaceholderObjectData noOpIn) {
    super(id, "InvPlaceholderUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(noOpIn, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }
/**
 *
 * Retrieves the InvPlaceholderObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvPlaceholderObjectData getOutput() {
    return InvPlaceholderObjectHelper.fromMap(outputMap, "InvPlaceholder");
  }
}
