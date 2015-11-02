/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceGetRequest.java
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
 * Class used to create a ServiceGetRequest Udt Request
 *
 */

public class ServiceGetRequest extends ServiceSubRequestParent {
/**
 *
 * Constructor to create a  ServiceGetRequest
 * @param id Unique request name
 * @param ServiceGetIn ServiceObjectBaseKeyData for ServiceGetRequest
 *
 */
@JsonCreator
  public ServiceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseKeyData ServiceGetIn) {
    super(id, "ServiceGet");
    if (ServiceGetIn != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(ServiceGetIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectBaseData that results from the ServiceGetRequest call
 * @return ServiceObjectBaseData resulting from udt call
 *
 */

  public ServiceObjectBaseData getOutput() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
}
