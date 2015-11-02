/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderFindCountRequest.java
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
 * Class used to create a ServiceOrderFindCountRequest Udt Request
 *
 */

public class ServiceOrderFindCountRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderFindCountRequest
 * @param id Unique request name
 * @param ServiceOrderFindCountIn ServiceOrderObjectBaseFilter for ServiceOrderFindCountRequest
 *
 */
@JsonCreator
  public ServiceOrderFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseFilter ServiceOrderFindCountIn) {
    super(id, "ServiceOrderFindCount");
    if (ServiceOrderFindCountIn != null) {
      Integer index =  ServiceOrderFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderFindCountIn, new HashMap(), "ServiceOrderCount").get("ServiceOrderCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the ServiceOrderFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("ServiceOrderCount");
  }
}
