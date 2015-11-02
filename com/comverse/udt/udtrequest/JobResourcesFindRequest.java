/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesFindRequest.java
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
 * Class used to create a JobResourcesFindRequest Udt Request
 *
 */

public class JobResourcesFindRequest extends JobResourcesRequest {
/**
 *
 * Constructor to create a  JobResourcesFindRequest
 * @param id Unique request name
 * @param JobResourcesFindIn JobResourcesObjectFilter for JobResourcesFindRequest
 *
 */
@JsonCreator
  public JobResourcesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("JobResources")JobResourcesObjectFilter JobResourcesFindIn) {
    super(id, "JobResourcesFind");
    if (JobResourcesFindIn != null) {
      Integer index =  JobResourcesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("JobResources", JobResourcesObjectHelper.toMap(JobResourcesFindIn, new HashMap(), "JobResources").get("JobResources"));
    }
  }

/**
 *
 * Retrieves the JobResourcesObjectDataList that results from the JobResourcesFindRequest call
 * @return JobResourcesObjectDataList resulting from udt call
 *
 */

  public JobResourcesObjectDataList getOutput() {
    return JobResourcesObjectHelper.fromMapList(outputMap, "JobResourcesList");
  }
}
