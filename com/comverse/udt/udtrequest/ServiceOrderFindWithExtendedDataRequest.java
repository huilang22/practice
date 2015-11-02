/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderFindWithExtendedDataRequest.java
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
 * Class used to create a ServiceOrderFindWithExtendedDataRequest Udt Request
 *
 */

public class ServiceOrderFindWithExtendedDataRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderFindWithExtendedDataRequest
 * @param id Unique request name
 * @param ServiceOrderExternalFindWEDIn ServiceOrderObjectFilter for ServiceOrderFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public ServiceOrderFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectFilter ServiceOrderExternalFindWEDIn) {
    super(id, "ServiceOrderFindWithExtendedData");
    if (ServiceOrderExternalFindWEDIn != null) {
      Integer index =  ServiceOrderExternalFindWEDIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ServiceOrderExternalFindWEDIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectDataList that results from the ServiceOrderFindWithExtendedDataRequest call
 * @return ServiceOrderObjectDataList resulting from udt call
 *
 */

  public ServiceOrderObjectDataList getOutput() {
    return ServiceOrderObjectHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
