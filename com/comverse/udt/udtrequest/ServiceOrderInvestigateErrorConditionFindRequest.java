/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvestigateErrorConditionFindRequest.java
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
 * Class used to create a ServiceOrderInvestigateErrorConditionFindRequest Udt Request
 *
 */

public class ServiceOrderInvestigateErrorConditionFindRequest extends ServiceOrderInvestigateRequest {
/**
 *
 * Constructor to create a  ServiceOrderInvestigateErrorConditionFindRequest
 * @param id Unique request name
 * @param ServiceOrderCondIn ServiceOrderInvestigateObjectFilter for ServiceOrderInvestigateErrorConditionFindRequest
 *
 */
@JsonCreator
  public ServiceOrderInvestigateErrorConditionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderInvestigate")ServiceOrderInvestigateObjectFilter ServiceOrderCondIn) {
    super(id, "ServiceOrderInvestigateErrorConditionFind");
    if (ServiceOrderCondIn != null) {
      Integer index =  ServiceOrderCondIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(ServiceOrderCondIn, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderInvestigateObjectDataList that results from the ServiceOrderInvestigateErrorConditionFindRequest call
 * @return ServiceOrderInvestigateObjectDataList resulting from udt call
 *
 */

  public ServiceOrderInvestigateObjectDataList getOutput() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
}
