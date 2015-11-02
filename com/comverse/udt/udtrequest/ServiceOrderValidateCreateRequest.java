/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderValidateCreateRequest.java
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
 * Class used to create a ServiceOrderValidateCreateRequest Udt Request
 *
 */

public class ServiceOrderValidateCreateRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderValidateCreateRequest
 * @param id Unique request name
 * @param ServiceOrderValidateCreateIn ServiceOrderObjectBaseData[] for ServiceOrderValidateCreateRequest
 * @param DateBasedValidation Boolean for ServiceOrderValidateCreateRequest
 * @param ResumeDt Date for ServiceOrderValidateCreateRequest
 *
 */
@JsonCreator
  public ServiceOrderValidateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseData[] ServiceOrderValidateCreateIn, @JsonProperty("DateBasedValidation")Boolean DateBasedValidation, @JsonProperty("ResumeDt")Date ResumeDt) {
    super(id, "ServiceOrderValidateCreate");
    if (ServiceOrderValidateCreateIn != null) {
      Object[] list = new Object[ServiceOrderValidateCreateIn.length];
      for (int i = 0; i < ServiceOrderValidateCreateIn.length; i++) {
        list[i] = ServiceOrderObjectBaseHelper.getMap(ServiceOrderValidateCreateIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
      }
      addInput("ServiceOrderList", list);
    }
    if (DateBasedValidation != null) {
      addInput("DateBasedValidation", DateBasedValidation);
    }
    if (ResumeDt != null) {
      addInput("ResumeDt", ResumeDt);
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseDataList that results from the ServiceOrderValidateCreateRequest call
 * @return ServiceOrderObjectBaseDataList resulting from udt call
 *
 */

  public ServiceOrderObjectBaseDataList getOutput() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
