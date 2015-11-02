/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ExclusionUpdateNoOpRequest Udt Request/Response
 *
 */
public class ExclusionUpdateNoOpRequest extends ExclusionSubRequestParent {
/**
 *
 * Constructor to create a   ExclusionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExclusionUpdateNoOpRequest(String id, ExclusionObjectData noOpIn) {
    super(id, "ExclusionUpdateNoOpRequest");
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
