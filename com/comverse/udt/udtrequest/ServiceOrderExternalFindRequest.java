/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderExternalFindRequest.java
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
 * Class used to create a ServiceOrderExternalFindRequest Udt Request
 *
 */

public class ServiceOrderExternalFindRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderExternalFindRequest
 * @param id Unique request name
 * @param ServiceOrderExternalXFindIn ServiceOrderObjectFilter for ServiceOrderExternalFindRequest
 *
 */
@JsonCreator
  public ServiceOrderExternalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectFilter ServiceOrderExternalXFindIn) {
    super(id, "ServiceOrderExternalFind");
    if (ServiceOrderExternalXFindIn != null) {
      Integer index =  ServiceOrderExternalXFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ServiceOrderExternalXFindIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectDataList that results from the ServiceOrderExternalFindRequest call
 * @return ServiceOrderObjectDataList resulting from udt call
 *
 */

  public ServiceOrderObjectDataList getOutput() {
    return ServiceOrderObjectHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
