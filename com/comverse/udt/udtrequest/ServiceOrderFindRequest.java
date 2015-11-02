/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderFindRequest.java
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
 * Class used to create a ServiceOrderFindRequest Udt Request
 *
 */

public class ServiceOrderFindRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderFindRequest
 * @param id Unique request name
 * @param ServiceOrderFindIn ServiceOrderObjectBaseFilter for ServiceOrderFindRequest
 *
 */
@JsonCreator
  public ServiceOrderFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseFilter ServiceOrderFindIn) {
    super(id, "ServiceOrderFind");
    if (ServiceOrderFindIn != null) {
      Integer index =  ServiceOrderFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderFindIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseDataList that results from the ServiceOrderFindRequest call
 * @return ServiceOrderObjectBaseDataList resulting from udt call
 *
 */

  public ServiceOrderObjectBaseDataList getOutput() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
