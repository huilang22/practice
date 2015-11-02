/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CitTaskTypeDeleteNoOpRequest Udt Request/Response
 *
 */
public class CitTaskTypeDeleteNoOpRequest extends CitTaskTypeSubRequestParent {
/**
 *
 * Constructor to create a   CitTaskTypeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskTypeDeleteNoOpRequest(String id, CitTaskTypeObjectData noOpIn) {
    super(id, "CitTaskTypeDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(noOpIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
/**
 *
 * Retrieves the CitTaskTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskTypeObjectData getOutput() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
}
