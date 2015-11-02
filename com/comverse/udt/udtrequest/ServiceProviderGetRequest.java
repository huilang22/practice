/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceProviderGetRequest Udt Request
 *
 */

public class ServiceProviderGetRequest extends ServiceProviderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceProviderGetRequest
 * @param id Unique request name
 * @param ServiceProviderGetIn ServiceProviderObjectKeyData for ServiceProviderGetRequest
 *
 */
@JsonCreator
  public ServiceProviderGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceProvider")ServiceProviderObjectKeyData ServiceProviderGetIn) {
    super(id, "ServiceProviderGet");
    if (ServiceProviderGetIn != null) {
      addInput("ServiceProvider", ServiceProviderObjectKeyHelper.toMap(ServiceProviderGetIn, new HashMap(), "ServiceProviderObjectKeyData").get("ServiceProviderObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceProviderObjectData that results from the ServiceProviderGetRequest call
 * @return ServiceProviderObjectData resulting from udt call
 *
 */

  public ServiceProviderObjectData getOutput() {
    return ServiceProviderObjectHelper.fromMap(outputMap, "ServiceProvider");
  }
}
