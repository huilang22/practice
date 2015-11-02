/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvestigateSfqExceptionFindRequest.java
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
 * Class used to create a ServiceOrderInvestigateSfqExceptionFindRequest Udt Request
 *
 */

public class ServiceOrderInvestigateSfqExceptionFindRequest extends ServiceOrderInvestigateRequest {
/**
 *
 * Constructor to create a  ServiceOrderInvestigateSfqExceptionFindRequest
 * @param id Unique request name
 * @param SfqExcepIn ServiceOrderInvestigateObjectFilter for ServiceOrderInvestigateSfqExceptionFindRequest
 *
 */
@JsonCreator
  public ServiceOrderInvestigateSfqExceptionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderInvestigate")ServiceOrderInvestigateObjectFilter SfqExcepIn) {
    super(id, "ServiceOrderInvestigateSfqExceptionFind");
    if (SfqExcepIn != null) {
      Integer index =  SfqExcepIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(SfqExcepIn, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderInvestigateObjectDataList that results from the ServiceOrderInvestigateSfqExceptionFindRequest call
 * @return ServiceOrderInvestigateObjectDataList resulting from udt call
 *
 */

  public ServiceOrderInvestigateObjectDataList getOutput() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
}
