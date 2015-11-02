/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityCreateNoOpRequest.java
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
 * NoOp class used to simulate a CitTaskPriorityCreateNoOpRequest Udt Request/Response
 *
 */
public class CitTaskPriorityCreateNoOpRequest extends CitTaskPrioritySubRequestParent {
/**
 *
 * Constructor to create a   CitTaskPriorityCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskPriorityCreateNoOpRequest(String id, CitTaskPriorityObjectData noOpIn) {
    super(id, "CitTaskPriorityCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(noOpIn, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }
/**
 *
 * Retrieves the CitTaskPriorityObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskPriorityObjectData getOutput() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
}
