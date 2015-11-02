/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceStatusGetRequest.java
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
 * Class used to create a ServiceStatusGetRequest Udt Request
 *
 */

public class ServiceStatusGetRequest extends ServiceStatusSubRequestParent {
/**
 *
 * Constructor to create a  ServiceStatusGetRequest
 * @param id Unique request name
 * @param ServiceStatusGetIn ServiceStatusObjectKeyData for ServiceStatusGetRequest
 *
 */
@JsonCreator
  public ServiceStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceStatus")ServiceStatusObjectKeyData ServiceStatusGetIn) {
    super(id, "ServiceStatusGet");
    if (ServiceStatusGetIn != null) {
      addInput("ServiceStatus", ServiceStatusObjectKeyHelper.toMap(ServiceStatusGetIn, new HashMap(), "ServiceStatusObjectKeyData").get("ServiceStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceStatusObjectData that results from the ServiceStatusGetRequest call
 * @return ServiceStatusObjectData resulting from udt call
 *
 */

  public ServiceStatusObjectData getOutput() {
    return ServiceStatusObjectHelper.fromMap(outputMap, "ServiceStatus");
  }
}
