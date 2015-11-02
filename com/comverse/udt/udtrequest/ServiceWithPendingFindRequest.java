/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceWithPendingFindRequest.java
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
 * Class used to create a ServiceWithPendingFindRequest Udt Request
 *
 */

public class ServiceWithPendingFindRequest extends ServiceRequest {
/**
 *
 * Constructor to create a  ServiceWithPendingFindRequest
 * @param id Unique request name
 * @param ServiceWithPendingFindIn ServiceObjectFilter for ServiceWithPendingFindRequest
 *
 */
@JsonCreator
  public ServiceWithPendingFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectFilter ServiceWithPendingFindIn) {
    super(id, "ServiceWithPendingFind");
    if (ServiceWithPendingFindIn != null) {
      Integer index =  ServiceWithPendingFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceWithPendingFindIn, new HashMap(), "Service").get("Service"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectDataList that results from the ServiceWithPendingFindRequest call
 * @return ServiceObjectDataList resulting from udt call
 *
 */

  public ServiceObjectDataList getOutput() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
}
