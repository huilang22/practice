/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionGetNoOpRequest.java
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
 * NoOp class used to simulate a ExclusionGetNoOpRequest Udt Request/Response
 *
 */
public class ExclusionGetNoOpRequest extends ExclusionSubRequestParent {
/**
 *
 * Constructor to create a   ExclusionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExclusionGetNoOpRequest(String id, ExclusionObjectData noOpIn) {
    super(id, "ExclusionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Exclusion", ExclusionObjectHelper.toMap(noOpIn, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }
/**
 *
 * Retrieves the ExclusionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ExclusionObjectData getOutput() {
    return ExclusionObjectHelper.fromMap(outputMap, "Exclusion");
  }
}
