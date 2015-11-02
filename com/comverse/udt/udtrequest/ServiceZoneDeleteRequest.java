/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneDeleteRequest.java
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
 * Class used to create a ServiceZoneDeleteRequest Udt Request
 *
 */

public class ServiceZoneDeleteRequest extends ServiceZoneSubRequestParent {
/**
 *
 * Constructor to create a  ServiceZoneDeleteRequest
 * @param id Unique request name
 * @param SZDeleteIn ServiceZoneObjectKeyData for ServiceZoneDeleteRequest
 * @param SZDCeaseDate Date for ServiceZoneDeleteRequest
 *
 */
@JsonCreator
  public ServiceZoneDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceZone")ServiceZoneObjectKeyData SZDeleteIn, @JsonProperty("InactiveDate")Date SZDCeaseDate) {
    super(id, "ServiceZoneDelete");
    if (SZDeleteIn != null) {
      addInput("ServiceZone", ServiceZoneObjectKeyHelper.toMap(SZDeleteIn, new HashMap(), "ServiceZoneObjectKeyData").get("ServiceZoneObjectKeyData"));
    }
    if (SZDCeaseDate != null) {
      addInput("InactiveDate", SZDCeaseDate);
    }
  }

/**
 *
 * Retrieves the ServiceZoneObjectData that results from the ServiceZoneDeleteRequest call
 * @return ServiceZoneObjectData resulting from udt call
 *
 */

  public ServiceZoneObjectData getOutput() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
}
