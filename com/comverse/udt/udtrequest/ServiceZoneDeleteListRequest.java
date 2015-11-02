/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneDeleteListRequest.java
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
 * Class used to create a ServiceZoneDeleteListRequest Udt Request
 *
 */

public class ServiceZoneDeleteListRequest extends ServiceZoneRequest {
/**
 *
 * Constructor to create a  ServiceZoneDeleteListRequest
 * @param id Unique request name
 * @param ServiceZoneFilter ServiceZoneObjectFilter for ServiceZoneDeleteListRequest
 * @param SZDLCeaseDate Date for ServiceZoneDeleteListRequest
 *
 */
@JsonCreator
  public ServiceZoneDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceZoneFilter")ServiceZoneObjectFilter ServiceZoneFilter, @JsonProperty("InactiveDate")Date SZDLCeaseDate) {
    super(id, "ServiceZoneDeleteList");
    if (ServiceZoneFilter != null) {
      Integer index =  ServiceZoneFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceZoneFilter", ServiceZoneObjectHelper.toMap(ServiceZoneFilter, new HashMap(), "Void").get("Void"));
    }
    if (SZDLCeaseDate != null) {
      addInput("InactiveDate", SZDLCeaseDate);
    }
  }

}
