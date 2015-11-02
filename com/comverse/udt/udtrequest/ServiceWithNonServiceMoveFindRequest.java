/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceWithNonServiceMoveFindRequest.java
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
 * Class used to create a ServiceWithNonServiceMoveFindRequest Udt Request
 *
 */

public class ServiceWithNonServiceMoveFindRequest extends ServiceRequest {
/**
 *
 * Constructor to create a  ServiceWithNonServiceMoveFindRequest
 * @param id Unique request name
 * @param ServiceWithNonServiceMoveFindIn ServiceObjectFilter for ServiceWithNonServiceMoveFindRequest
 *
 */
@JsonCreator
  public ServiceWithNonServiceMoveFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectFilter ServiceWithNonServiceMoveFindIn) {
    super(id, "ServiceWithNonServiceMoveFind");
    if (ServiceWithNonServiceMoveFindIn != null) {
      Integer index =  ServiceWithNonServiceMoveFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceWithNonServiceMoveFindIn, new HashMap(), "Service").get("Service"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectDataList that results from the ServiceWithNonServiceMoveFindRequest call
 * @return ServiceObjectDataList resulting from udt call
 *
 */

  public ServiceObjectDataList getOutput() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
}
