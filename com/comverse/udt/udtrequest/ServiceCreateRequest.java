/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCreateRequest.java
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
 * Class used to create a ServiceCreateRequest Udt Request
 *
 */

public class ServiceCreateRequest extends ServiceSubRequestParent {
/**
 *
 * Constructor to create a  ServiceCreateRequest
 * @param id Unique request name
 * @param ServiceCreateIn ServiceObjectBaseData for ServiceCreateRequest
 *
 */
@JsonCreator
  public ServiceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseData ServiceCreateIn) {
    super(id, "ServiceCreate");
    if (ServiceCreateIn != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceCreateIn, new HashMap(), "Service").get("Service"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectBaseData that results from the ServiceCreateRequest call
 * @return ServiceObjectBaseData resulting from udt call
 *
 */

  public ServiceObjectBaseData getOutput() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
}
