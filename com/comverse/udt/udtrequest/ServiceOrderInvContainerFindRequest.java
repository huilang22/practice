/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvContainerFindRequest.java
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
 * Class used to create a ServiceOrderInvContainerFindRequest Udt Request
 *
 */

public class ServiceOrderInvContainerFindRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderInvContainerFindRequest
 * @param id Unique request name
 * @param ServiceOrderInvContainerFindIn ServiceOrderObjectData for ServiceOrderInvContainerFindRequest
 *
 */
@JsonCreator
  public ServiceOrderInvContainerFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectData ServiceOrderInvContainerFindIn) {
    super(id, "ServiceOrderInvContainerFind");
    if (ServiceOrderInvContainerFindIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ServiceOrderInvContainerFindIn, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }

/**
 *
 * Retrieves the InvContainerIdObjectDataList that results from the ServiceOrderInvContainerFindRequest call
 * @return InvContainerIdObjectDataList resulting from udt call
 *
 */

  public InvContainerIdObjectDataList getOutput() {
    return InvContainerIdObjectHelper.fromMapList(outputMap, "InvContainerList");
  }
}
