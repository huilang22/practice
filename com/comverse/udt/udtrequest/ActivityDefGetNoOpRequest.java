/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefGetNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a ActivityDefGetNoOpRequest Udt Request/Response
 *
 */
public class ActivityDefGetNoOpRequest extends ActivityDefSubRequestParent {
/**
 *
 * Constructor to create a   ActivityDefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ActivityDefGetNoOpRequest(String id, ActivityDefObjectData noOpIn) {
    super(id, "ActivityDefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(noOpIn, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }
/**
 *
 * Retrieves the ActivityDefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ActivityDefObjectData getOutput() {
    return ActivityDefObjectHelper.fromMap(outputMap, "ActivityDef");
  }
}
