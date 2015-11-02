/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesCreateRequest.java
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
 * Class used to create a JobResourcesCreateRequest Udt Request
 *
 */

public class JobResourcesCreateRequest extends JobResourcesSubRequestParent {
/**
 *
 * Constructor to create a  JobResourcesCreateRequest
 * @param id Unique request name
 * @param JobResourcesCreateIn JobResourcesObjectData for JobResourcesCreateRequest
 *
 */
@JsonCreator
  public JobResourcesCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("JobResources")JobResourcesObjectData JobResourcesCreateIn) {
    super(id, "JobResourcesCreate");
    if (JobResourcesCreateIn != null) {
      addInput("JobResources", JobResourcesObjectHelper.toMap(JobResourcesCreateIn, new HashMap(), "JobResources").get("JobResources"));
    }
  }

/**
 *
 * Retrieves the JobResourcesObjectData that results from the JobResourcesCreateRequest call
 * @return JobResourcesObjectData resulting from udt call
 *
 */

  public JobResourcesObjectData getOutput() {
    return JobResourcesObjectHelper.fromMap(outputMap, "JobResources");
  }
}
