/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceGetNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitImportanceGetNoOpRequest Udt Request/Response
 *
 */
public class CitImportanceGetNoOpRequest extends CitImportanceSubRequestParent {
/**
 *
 * Constructor to create a   CitImportanceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitImportanceGetNoOpRequest(String id, CitImportanceObjectData noOpIn) {
    super(id, "CitImportanceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CitImportance", CitImportanceObjectHelper.toMap(noOpIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
/**
 *
 * Retrieves the CitImportanceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CitImportanceObjectData getOutput() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
}
