/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWorkflowMapFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceOrderWorkflowMapFindRequest Udt Request
 *
 */

public class ServiceOrderWorkflowMapFindRequest extends ServiceOrderWorkflowMapRequest {
/**
 *
 * Constructor to create a  ServiceOrderWorkflowMapFindRequest
 * @param id Unique request name
 * @param ServiceOrderWorkflowMapFindIn ServiceOrderWorkflowMapObjectFilter for ServiceOrderWorkflowMapFindRequest
 *
 */
@JsonCreator
  public ServiceOrderWorkflowMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderWorkflowMap")ServiceOrderWorkflowMapObjectFilter ServiceOrderWorkflowMapFindIn) {
    super(id, "ServiceOrderWorkflowMapFind");
    if (ServiceOrderWorkflowMapFindIn != null) {
      Integer index =  ServiceOrderWorkflowMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectHelper.toMap(ServiceOrderWorkflowMapFindIn, new HashMap(), "ServiceOrderWorkflowMap").get("ServiceOrderWorkflowMap"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderWorkflowMapObjectDataList that results from the ServiceOrderWorkflowMapFindRequest call
 * @return ServiceOrderWorkflowMapObjectDataList resulting from udt call
 *
 */

  public ServiceOrderWorkflowMapObjectDataList getOutput() {
    return ServiceOrderWorkflowMapObjectHelper.fromMapList(outputMap, "ServiceOrderWorkflowMapList");
  }
}
