/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderValidateRequest.java
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
 * Class used to create a ServiceOrderValidateRequest Udt Request
 *
 */

public class ServiceOrderValidateRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderValidateRequest
 * @param id Unique request name
 * @param ServiceOrderValidateIn ServiceOrderObjectBaseData[] for ServiceOrderValidateRequest
 *
 */
@JsonCreator
  public ServiceOrderValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseData[] ServiceOrderValidateIn) {
    super(id, "ServiceOrderValidate");
    if (ServiceOrderValidateIn != null) {
      Object[] list = new Object[ServiceOrderValidateIn.length];
      for (int i = 0; i < ServiceOrderValidateIn.length; i++) {
        list[i] = ServiceOrderObjectBaseHelper.getMap(ServiceOrderValidateIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
      }
      addInput("ServiceOrderList", list);
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseDataList that results from the ServiceOrderValidateRequest call
 * @return ServiceOrderObjectBaseDataList resulting from udt call
 *
 */

  public ServiceOrderObjectBaseDataList getOutput() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
