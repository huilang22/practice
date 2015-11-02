/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderSuspendCreateRequest.java
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
 * Class used to create a ServiceOrderSuspendCreateRequest Udt Request
 *
 */

public class ServiceOrderSuspendCreateRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderSuspendCreateRequest
 * @param id Unique request name
 * @param SuspServiceOrderCreateIn ServiceOrderObjectBaseData for ServiceOrderSuspendCreateRequest
 * @param ResumeDate Date for ServiceOrderSuspendCreateRequest
 *
 */
@JsonCreator
  public ServiceOrderSuspendCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseData SuspServiceOrderCreateIn, @JsonProperty("ResumeDate")Date ResumeDate) {
    super(id, "ServiceOrderSuspendCreate");
    if (SuspServiceOrderCreateIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(SuspServiceOrderCreateIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
    if (ResumeDate != null) {
      addInput("ResumeDate", ResumeDate);
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseDataList that results from the ServiceOrderSuspendCreateRequest call
 * @return ServiceOrderObjectBaseDataList resulting from udt call
 *
 */

  public ServiceOrderObjectBaseDataList getOutput() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
