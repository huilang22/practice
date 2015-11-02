/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderListUpdateRequest.java
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
 * Class used to create a ServiceOrderListUpdateRequest Udt Request
 *
 */

public class ServiceOrderListUpdateRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderListUpdateRequest
 * @param id Unique request name
 * @param SOLUpdateIn ServiceOrderObjectBaseData[] for ServiceOrderListUpdateRequest
 *
 */
@JsonCreator
  public ServiceOrderListUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseData[] SOLUpdateIn) {
    super(id, "ServiceOrderListUpdate");
    if (SOLUpdateIn != null) {
      Object[] list = new Object[SOLUpdateIn.length];
      for (int i = 0; i < SOLUpdateIn.length; i++) {
        list[i] = ServiceOrderObjectBaseHelper.getMap(SOLUpdateIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
      }
      addInput("ServiceOrderList", list);
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseDataList that results from the ServiceOrderListUpdateRequest call
 * @return ServiceOrderObjectBaseDataList resulting from udt call
 *
 */

  public ServiceOrderObjectBaseDataList getOutput() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
