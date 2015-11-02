/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceExternalGetRequest.java
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
 * Class used to create a ServiceExternalGetRequest Udt Request
 *
 */

public class ServiceExternalGetRequest extends ServiceSubRequestParent {
/**
 *
 * Constructor to create a  ServiceExternalGetRequest
 * @param id Unique request name
 * @param ServiceXIDGetIn ServiceObjectBaseKeyData for ServiceExternalGetRequest
 *
 */
@JsonCreator
  public ServiceExternalGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseKeyData ServiceXIDGetIn) {
    super(id, "ServiceExternalGet");
    if (ServiceXIDGetIn != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(ServiceXIDGetIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectData that results from the ServiceExternalGetRequest call
 * @return ServiceObjectData resulting from udt call
 *
 */

  public ServiceObjectData getOutput() {
    return ServiceObjectHelper.fromMap(outputMap, "Service");
  }
}
