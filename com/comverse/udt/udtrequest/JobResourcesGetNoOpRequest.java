/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesGetNoOpRequest.java
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
 * NoOp class used to simulate a JobResourcesGetNoOpRequest Udt Request/Response
 *
 */
public class JobResourcesGetNoOpRequest extends JobResourcesSubRequestParent {
/**
 *
 * Constructor to create a   JobResourcesGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public JobResourcesGetNoOpRequest(String id, JobResourcesObjectData noOpIn) {
    super(id, "JobResourcesGetNoOpRequest");
    if (noOpIn != null) {
      addInput("JobResources", JobResourcesObjectHelper.toMap(noOpIn, new HashMap(), "JobResources").get("JobResources"));
    }
  }
/**
 *
 * Retrieves the JobResourcesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public JobResourcesObjectData getOutput() {
    return JobResourcesObjectHelper.fromMap(outputMap, "JobResources");
  }
}
