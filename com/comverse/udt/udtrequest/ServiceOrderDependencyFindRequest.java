/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyFindRequest.java
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
 * Class used to create a ServiceOrderDependencyFindRequest Udt Request
 *
 */

public class ServiceOrderDependencyFindRequest extends ServiceOrderDependencyRequest {
/**
 *
 * Constructor to create a  ServiceOrderDependencyFindRequest
 * @param id Unique request name
 * @param ServiceOrderDependencyFindIn ServiceOrderDependencyObjectFilter for ServiceOrderDependencyFindRequest
 *
 */
@JsonCreator
  public ServiceOrderDependencyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderDependency")ServiceOrderDependencyObjectFilter ServiceOrderDependencyFindIn) {
    super(id, "ServiceOrderDependencyFind");
    if (ServiceOrderDependencyFindIn != null) {
      Integer index =  ServiceOrderDependencyFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(ServiceOrderDependencyFindIn, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderDependencyObjectDataList that results from the ServiceOrderDependencyFindRequest call
 * @return ServiceOrderDependencyObjectDataList resulting from udt call
 *
 */

  public ServiceOrderDependencyObjectDataList getOutput() {
    return ServiceOrderDependencyObjectHelper.fromMapList(outputMap, "ServiceOrderDependencyList");
  }
}
