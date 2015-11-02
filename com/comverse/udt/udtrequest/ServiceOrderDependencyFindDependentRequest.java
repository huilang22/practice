/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyFindDependentRequest.java
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
 * Class used to create a ServiceOrderDependencyFindDependentRequest Udt Request
 *
 */

public class ServiceOrderDependencyFindDependentRequest extends ServiceOrderDependencyRequest {
/**
 *
 * Constructor to create a  ServiceOrderDependencyFindDependentRequest
 * @param id Unique request name
 * @param ServiceOrderDependencyFindDependentIn ServiceOrderDependencyObjectFilter for ServiceOrderDependencyFindDependentRequest
 *
 */
@JsonCreator
  public ServiceOrderDependencyFindDependentRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderDependency")ServiceOrderDependencyObjectFilter ServiceOrderDependencyFindDependentIn) {
    super(id, "ServiceOrderDependencyFindDependent");
    if (ServiceOrderDependencyFindDependentIn != null) {
      Integer index =  ServiceOrderDependencyFindDependentIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(ServiceOrderDependencyFindDependentIn, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderDependencyObjectDataList that results from the ServiceOrderDependencyFindDependentRequest call
 * @return ServiceOrderDependencyObjectDataList resulting from udt call
 *
 */

  public ServiceOrderDependencyObjectDataList getOutput() {
    return ServiceOrderDependencyObjectHelper.fromMapList(outputMap, "ServiceOrderDependencyList");
  }
}
