/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvestigateExceptionFindRequest.java
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
 * Class used to create a ServiceOrderInvestigateExceptionFindRequest Udt Request
 *
 */

public class ServiceOrderInvestigateExceptionFindRequest extends ServiceOrderInvestigateRequest {
/**
 *
 * Constructor to create a  ServiceOrderInvestigateExceptionFindRequest
 * @param id Unique request name
 * @param ServiceOrderExcepIn ServiceOrderInvestigateObjectFilter for ServiceOrderInvestigateExceptionFindRequest
 *
 */
@JsonCreator
  public ServiceOrderInvestigateExceptionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderInvestigate")ServiceOrderInvestigateObjectFilter ServiceOrderExcepIn) {
    super(id, "ServiceOrderInvestigateExceptionFind");
    if (ServiceOrderExcepIn != null) {
      Integer index =  ServiceOrderExcepIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(ServiceOrderExcepIn, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderInvestigateObjectDataList that results from the ServiceOrderInvestigateExceptionFindRequest call
 * @return ServiceOrderInvestigateObjectDataList resulting from udt call
 *
 */

  public ServiceOrderInvestigateObjectDataList getOutput() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
}
