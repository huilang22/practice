/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWithLogicalFindRequest.java
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
 * Class used to create a ServiceOrderWithLogicalFindRequest Udt Request
 *
 */

public class ServiceOrderWithLogicalFindRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderWithLogicalFindRequest
 * @param id Unique request name
 * @param ServiceOrderWithLogicalFindIn ServiceOrderObjectBaseFilter for ServiceOrderWithLogicalFindRequest
 *
 */
@JsonCreator
  public ServiceOrderWithLogicalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseFilter ServiceOrderWithLogicalFindIn) {
    super(id, "ServiceOrderWithLogicalFind");
    if (ServiceOrderWithLogicalFindIn != null) {
      Integer index =  ServiceOrderWithLogicalFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderWithLogicalFindIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseDataList that results from the ServiceOrderWithLogicalFindRequest call
 * @return ServiceOrderObjectBaseDataList resulting from udt call
 *
 */

  public ServiceOrderObjectBaseDataList getOutput() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
