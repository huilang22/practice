/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesUpdateRequest.java
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
 * Class used to create a JobResourcesUpdateRequest Udt Request
 *
 */

public class JobResourcesUpdateRequest extends JobResourcesSubRequestParent {
/**
 *
 * Constructor to create a  JobResourcesUpdateRequest
 * @param id Unique request name
 * @param JobResourcesUpdateIn JobResourcesObjectData for JobResourcesUpdateRequest
 *
 */
@JsonCreator
  public JobResourcesUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("JobResources")JobResourcesObjectData JobResourcesUpdateIn) {
    super(id, "JobResourcesUpdate");
    if (JobResourcesUpdateIn != null) {
      addInput("JobResources", JobResourcesObjectHelper.toMap(JobResourcesUpdateIn, new HashMap(), "JobResources").get("JobResources"));
    }
  }

/**
 *
 * Retrieves the JobResourcesObjectData that results from the JobResourcesUpdateRequest call
 * @return JobResourcesObjectData resulting from udt call
 *
 */

  public JobResourcesObjectData getOutput() {
    return JobResourcesObjectHelper.fromMap(outputMap, "JobResources");
  }
}
