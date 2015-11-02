/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a JobResourcesGetRequest Udt Request
 *
 */

public class JobResourcesGetRequest extends JobResourcesSubRequestParent {
/**
 *
 * Constructor to create a  JobResourcesGetRequest
 * @param id Unique request name
 * @param JobResourcesGetIn JobResourcesObjectKeyData for JobResourcesGetRequest
 *
 */
@JsonCreator
  public JobResourcesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("JobResources")JobResourcesObjectKeyData JobResourcesGetIn) {
    super(id, "JobResourcesGet");
    if (JobResourcesGetIn != null) {
      addInput("JobResources", JobResourcesObjectKeyHelper.toMap(JobResourcesGetIn, new HashMap(), "JobResourcesObjectKeyData").get("JobResourcesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the JobResourcesObjectData that results from the JobResourcesGetRequest call
 * @return JobResourcesObjectData resulting from udt call
 *
 */

  public JobResourcesObjectData getOutput() {
    return JobResourcesObjectHelper.fromMap(outputMap, "JobResources");
  }
}
