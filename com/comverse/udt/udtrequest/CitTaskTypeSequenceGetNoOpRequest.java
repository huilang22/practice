/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a CitTaskTypeSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class CitTaskTypeSequenceGetNoOpRequest extends CitTaskTypeSubRequestParent {
/**
 *
 * Constructor to create a   CitTaskTypeSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskTypeSequenceGetNoOpRequest(String id, CitTaskTypeObjectKeyData noOpIn) {
    super(id, "CitTaskTypeSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CitTaskType", CitTaskTypeObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
/**
 *
 * Retrieves the CitTaskTypeObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskTypeObjectKeyData getOutput() {
    return CitTaskTypeObjectKeyHelper.fromMap(outputMap, "CitTaskType");
  }
}
