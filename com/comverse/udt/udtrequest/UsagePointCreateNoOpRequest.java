/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointCreateNoOpRequest.java
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
 * NoOp class used to simulate a UsagePointCreateNoOpRequest Udt Request/Response
 *
 */
public class UsagePointCreateNoOpRequest extends UsagePointSubRequestParent {
/**
 *
 * Constructor to create a   UsagePointCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsagePointCreateNoOpRequest(String id, UsgPntObjectData noOpIn) {
    super(id, "UsagePointCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("UsagePoint", UsgPntObjectHelper.toMap(noOpIn, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }
/**
 *
 * Retrieves the UsgPntObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsgPntObjectData getOutput() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
}
