/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneFindRequest.java
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
 * Class used to create a ServiceZoneFindRequest Udt Request
 *
 */

public class ServiceZoneFindRequest extends ServiceZoneRequest {
/**
 *
 * Constructor to create a  ServiceZoneFindRequest
 * @param id Unique request name
 * @param SZFindIn ServiceZoneObjectFilter for ServiceZoneFindRequest
 *
 */
@JsonCreator
  public ServiceZoneFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceZone")ServiceZoneObjectFilter SZFindIn) {
    super(id, "ServiceZoneFind");
    if (SZFindIn != null) {
      Integer index =  SZFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(SZFindIn, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }

/**
 *
 * Retrieves the ServiceZoneObjectDataList that results from the ServiceZoneFindRequest call
 * @return ServiceZoneObjectDataList resulting from udt call
 *
 */

  public ServiceZoneObjectDataList getOutput() {
    return ServiceZoneObjectHelper.fromMapList(outputMap, "ServiceZoneList");
  }
}
