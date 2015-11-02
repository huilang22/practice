/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextGetNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UsagePointTextGetNoOpRequest Udt Request/Response
 *
 */
public class UsagePointTextGetNoOpRequest extends UsagePointTextSubRequestParent {
/**
 *
 * Constructor to create a   UsagePointTextGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsagePointTextGetNoOpRequest(String id, UsagePointTextObjectData noOpIn) {
    super(id, "UsagePointTextGetNoOpRequest");
    if (noOpIn != null) {
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(noOpIn, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }
/**
 *
 * Retrieves the UsagePointTextObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsagePointTextObjectData getOutput() {
    return UsagePointTextObjectHelper.fromMap(outputMap, "UsagePointText");
  }
}
