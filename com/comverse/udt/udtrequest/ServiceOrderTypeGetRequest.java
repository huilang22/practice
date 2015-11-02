/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeGetRequest.java
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
 * Class used to create a ServiceOrderTypeGetRequest Udt Request
 *
 */

public class ServiceOrderTypeGetRequest extends ServiceOrderTypeSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderTypeGetRequest
 * @param id Unique request name
 * @param ServiceOrderTypeGetIn ServiceOrderTypeObjectKeyData for ServiceOrderTypeGetRequest
 *
 */
@JsonCreator
  public ServiceOrderTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderType")ServiceOrderTypeObjectKeyData ServiceOrderTypeGetIn) {
    super(id, "ServiceOrderTypeGet");
    if (ServiceOrderTypeGetIn != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectKeyHelper.toMap(ServiceOrderTypeGetIn, new HashMap(), "ServiceOrderTypeObjectKeyData").get("ServiceOrderTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderTypeObjectData that results from the ServiceOrderTypeGetRequest call
 * @return ServiceOrderTypeObjectData resulting from udt call
 *
 */

  public ServiceOrderTypeObjectData getOutput() {
    return ServiceOrderTypeObjectHelper.fromMap(outputMap, "ServiceOrderType");
  }
}
