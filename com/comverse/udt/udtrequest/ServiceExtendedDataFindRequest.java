/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceExtendedDataFindRequest.java
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
 * Class used to create a ServiceExtendedDataFindRequest Udt Request
 *
 */

public class ServiceExtendedDataFindRequest extends ServiceRequest {
/**
 *
 * Constructor to create a  ServiceExtendedDataFindRequest
 * @param id Unique request name
 * @param sedfIn ServiceObjectBaseKeyData for ServiceExtendedDataFindRequest
 *
 */
@JsonCreator
  public ServiceExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseKeyData sedfIn) {
    super(id, "ServiceExtendedDataFind");
    if (sedfIn != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(sedfIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceEDObjectDataList that results from the ServiceExtendedDataFindRequest call
 * @return ServiceEDObjectDataList resulting from udt call
 *
 */

  public ServiceEDObjectDataList getOutput() {
    return ServiceEDObjectHelper.fromMapList(outputMap, "ServiceExtendedDataList");
  }
}
