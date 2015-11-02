/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneCreateRequest.java
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
 * Class used to create a ServiceZoneCreateRequest Udt Request
 *
 */

public class ServiceZoneCreateRequest extends ServiceZoneSubRequestParent {
/**
 *
 * Constructor to create a  ServiceZoneCreateRequest
 * @param id Unique request name
 * @param SZCreateIn ServiceZoneObjectData for ServiceZoneCreateRequest
 *
 */
@JsonCreator
  public ServiceZoneCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceZone")ServiceZoneObjectData SZCreateIn) {
    super(id, "ServiceZoneCreate");
    if (SZCreateIn != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(SZCreateIn, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }

/**
 *
 * Retrieves the ServiceZoneObjectData that results from the ServiceZoneCreateRequest call
 * @return ServiceZoneObjectData resulting from udt call
 *
 */

  public ServiceZoneObjectData getOutput() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
}
