/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeCreateRequest.java
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
 * Class used to create a ServiceOrderTypeCreateRequest Udt Request
 *
 */

public class ServiceOrderTypeCreateRequest extends ServiceOrderTypeSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderTypeCreateRequest
 * @param id Unique request name
 * @param ServiceOrderTypeCreateIn ServiceOrderTypeObjectData for ServiceOrderTypeCreateRequest
 *
 */
@JsonCreator
  public ServiceOrderTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderType")ServiceOrderTypeObjectData ServiceOrderTypeCreateIn) {
    super(id, "ServiceOrderTypeCreate");
    if (ServiceOrderTypeCreateIn != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(ServiceOrderTypeCreateIn, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderTypeObjectData that results from the ServiceOrderTypeCreateRequest call
 * @return ServiceOrderTypeObjectData resulting from udt call
 *
 */

  public ServiceOrderTypeObjectData getOutput() {
    return ServiceOrderTypeObjectHelper.fromMap(outputMap, "ServiceOrderType");
  }
}
