/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskGetNoOpRequest.java
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
 * NoOp class used to simulate a CitTaskGetNoOpRequest Udt Request/Response
 *
 */
public class CitTaskGetNoOpRequest extends CitTaskSubRequestParent {
/**
 *
 * Constructor to create a   CitTaskGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskGetNoOpRequest(String id, CitTaskObjectData noOpIn) {
    super(id, "CitTaskGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CitTask", CitTaskObjectHelper.toMap(noOpIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }
/**
 *
 * Retrieves the CitTaskObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskObjectData getOutput() {
    return CitTaskObjectHelper.fromMap(outputMap, "CitTask");
  }
}
