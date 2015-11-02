/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneGetRequest.java
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
 * Class used to create a ServiceZoneGetRequest Udt Request
 *
 */

public class ServiceZoneGetRequest extends ServiceZoneSubRequestParent {
/**
 *
 * Constructor to create a  ServiceZoneGetRequest
 * @param id Unique request name
 * @param SZGetIn ServiceZoneObjectKeyData for ServiceZoneGetRequest
 *
 */
@JsonCreator
  public ServiceZoneGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceZone")ServiceZoneObjectKeyData SZGetIn) {
    super(id, "ServiceZoneGet");
    if (SZGetIn != null) {
      addInput("ServiceZone", ServiceZoneObjectKeyHelper.toMap(SZGetIn, new HashMap(), "ServiceZoneObjectKeyData").get("ServiceZoneObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceZoneObjectData that results from the ServiceZoneGetRequest call
 * @return ServiceZoneObjectData resulting from udt call
 *
 */

  public ServiceZoneObjectData getOutput() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
}
