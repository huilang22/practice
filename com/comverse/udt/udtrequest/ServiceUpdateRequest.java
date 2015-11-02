/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceUpdateRequest.java
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
 * Class used to create a ServiceUpdateRequest Udt Request
 *
 */

public class ServiceUpdateRequest extends ServiceSubRequestParent {
/**
 *
 * Constructor to create a  ServiceUpdateRequest
 * @param id Unique request name
 * @param ServiceUpdateIn ServiceObjectBaseData for ServiceUpdateRequest
 *
 */
@JsonCreator
  public ServiceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseData ServiceUpdateIn) {
    super(id, "ServiceUpdate");
    if (ServiceUpdateIn != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceUpdateIn, new HashMap(), "Service").get("Service"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectBaseData that results from the ServiceUpdateRequest call
 * @return ServiceObjectBaseData resulting from udt call
 *
 */

  public ServiceObjectBaseData getOutput() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
}
