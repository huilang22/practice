/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderCreateRequest.java
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
 * Class used to create a ServiceProviderCreateRequest Udt Request
 *
 */

public class ServiceProviderCreateRequest extends ServiceProviderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceProviderCreateRequest
 * @param id Unique request name
 * @param ServiceProviderCreateIn ServiceProviderObjectData for ServiceProviderCreateRequest
 *
 */
@JsonCreator
  public ServiceProviderCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceProvider")ServiceProviderObjectData ServiceProviderCreateIn) {
    super(id, "ServiceProviderCreate");
    if (ServiceProviderCreateIn != null) {
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(ServiceProviderCreateIn, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }

/**
 *
 * Retrieves the ServiceProviderObjectData that results from the ServiceProviderCreateRequest call
 * @return ServiceProviderObjectData resulting from udt call
 *
 */

  public ServiceProviderObjectData getOutput() {
    return ServiceProviderObjectHelper.fromMap(outputMap, "ServiceProvider");
  }
}
