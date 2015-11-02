/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a CitTaskTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class CitTaskTypeCreateNoOpRequest extends CitTaskTypeSubRequestParent {
/**
 *
 * Constructor to create a   CitTaskTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskTypeCreateNoOpRequest(String id, CitTaskTypeObjectData noOpIn) {
    super(id, "CitTaskTypeCreateNoOpRequest");
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
