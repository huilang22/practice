/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAlternateGetRequest.java
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
 * Class used to create a ServiceAlternateGetRequest Udt Request
 *
 */

public class ServiceAlternateGetRequest extends ServiceSubRequestParent {
/**
 *
 * Constructor to create a  ServiceAlternateGetRequest
 * @param id Unique request name
 * @param ServiceAlternateGetIn ServiceObjectBaseData for ServiceAlternateGetRequest
 *
 */
@JsonCreator
  public ServiceAlternateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseData ServiceAlternateGetIn) {
    super(id, "ServiceAlternateGet");
    if (ServiceAlternateGetIn != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceAlternateGetIn, new HashMap(), "Service").get("Service"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectBaseData that results from the ServiceAlternateGetRequest call
 * @return ServiceObjectBaseData resulting from udt call
 *
 */

  public ServiceObjectBaseData getOutput() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
}
