/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceZoneUpdateRequest Udt Request
 *
 */

public class ServiceZoneUpdateRequest extends ServiceZoneSubRequestParent {
/**
 *
 * Constructor to create a  ServiceZoneUpdateRequest
 * @param id Unique request name
 * @param SZUpdateIn ServiceZoneObjectData for ServiceZoneUpdateRequest
 *
 */
@JsonCreator
  public ServiceZoneUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceZone")ServiceZoneObjectData SZUpdateIn) {
    super(id, "ServiceZoneUpdate");
    if (SZUpdateIn != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(SZUpdateIn, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }

/**
 *
 * Retrieves the ServiceZoneObjectData that results from the ServiceZoneUpdateRequest call
 * @return ServiceZoneObjectData resulting from udt call
 *
 */

  public ServiceZoneObjectData getOutput() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
}
