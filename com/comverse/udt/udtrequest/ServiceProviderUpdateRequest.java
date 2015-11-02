/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderUpdateRequest.java
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
 * Class used to create a ServiceProviderUpdateRequest Udt Request
 *
 */

public class ServiceProviderUpdateRequest extends ServiceProviderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceProviderUpdateRequest
 * @param id Unique request name
 * @param ServiceProviderUpdateIn ServiceProviderObjectData for ServiceProviderUpdateRequest
 *
 */
@JsonCreator
  public ServiceProviderUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceProvider")ServiceProviderObjectData ServiceProviderUpdateIn) {
    super(id, "ServiceProviderUpdate");
    if (ServiceProviderUpdateIn != null) {
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(ServiceProviderUpdateIn, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }

/**
 *
 * Retrieves the ServiceProviderObjectData that results from the ServiceProviderUpdateRequest call
 * @return ServiceProviderObjectData resulting from udt call
 *
 */

  public ServiceProviderObjectData getOutput() {
    return ServiceProviderObjectHelper.fromMap(outputMap, "ServiceProvider");
  }
}
