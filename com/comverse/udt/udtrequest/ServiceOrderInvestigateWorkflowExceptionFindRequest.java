/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvestigateWorkflowExceptionFindRequest.java
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
 * Class used to create a ServiceOrderInvestigateWorkflowExceptionFindRequest Udt Request
 *
 */

public class ServiceOrderInvestigateWorkflowExceptionFindRequest extends ServiceOrderInvestigateRequest {
/**
 *
 * Constructor to create a  ServiceOrderInvestigateWorkflowExceptionFindRequest
 * @param id Unique request name
 * @param WfmExcepIn ServiceOrderInvestigateObjectFilter for ServiceOrderInvestigateWorkflowExceptionFindRequest
 *
 */
@JsonCreator
  public ServiceOrderInvestigateWorkflowExceptionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderInvestigate")ServiceOrderInvestigateObjectFilter WfmExcepIn) {
    super(id, "ServiceOrderInvestigateWorkflowExceptionFind");
    if (WfmExcepIn != null) {
      Integer index =  WfmExcepIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(WfmExcepIn, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderInvestigateObjectDataList that results from the ServiceOrderInvestigateWorkflowExceptionFindRequest call
 * @return ServiceOrderInvestigateObjectDataList resulting from udt call
 *
 */

  public ServiceOrderInvestigateObjectDataList getOutput() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
}
