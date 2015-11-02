/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceStatusFindRequest.java
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
 * Class used to create a ServiceStatusFindRequest Udt Request
 *
 */

public class ServiceStatusFindRequest extends ServiceStatusRequest {
/**
 *
 * Constructor to create a  ServiceStatusFindRequest
 * @param id Unique request name
 * @param ServiceStatusFindIn ServiceStatusObjectFilter for ServiceStatusFindRequest
 *
 */
@JsonCreator
  public ServiceStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceStatus")ServiceStatusObjectFilter ServiceStatusFindIn) {
    super(id, "ServiceStatusFind");
    if (ServiceStatusFindIn != null) {
      Integer index =  ServiceStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceStatus", ServiceStatusObjectHelper.toMap(ServiceStatusFindIn, new HashMap(), "ServiceStatus").get("ServiceStatus"));
    }
  }

/**
 *
 * Retrieves the ServiceStatusObjectDataList that results from the ServiceStatusFindRequest call
 * @return ServiceStatusObjectDataList resulting from udt call
 *
 */

  public ServiceStatusObjectDataList getOutput() {
    return ServiceStatusObjectHelper.fromMapList(outputMap, "ServiceStatusList");
  }
}
