/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneCancelRequest.java
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
 * Class used to create a ServiceZoneCancelRequest Udt Request
 *
 */

public class ServiceZoneCancelRequest extends ServiceZoneRequest {
/**
 *
 * Constructor to create a  ServiceZoneCancelRequest
 * @param id Unique request name
 * @param SZCancelIn ServiceZoneObjectData for ServiceZoneCancelRequest
 * @param SZCCeaseDate Date for ServiceZoneCancelRequest
 *
 */
@JsonCreator
  public ServiceZoneCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceZone")ServiceZoneObjectData SZCancelIn, @JsonProperty("CancelDate")Date SZCCeaseDate) {
    super(id, "ServiceZoneCancel");
    if (SZCancelIn != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(SZCancelIn, new HashMap(), "Void").get("Void"));
    }
    if (SZCCeaseDate != null) {
      addInput("CancelDate", SZCCeaseDate);
    }
  }

}
