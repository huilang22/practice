/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderUpdateRequest.java
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
 * Class used to create a ServiceOrderUpdateRequest Udt Request
 *
 */

public class ServiceOrderUpdateRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderUpdateRequest
 * @param id Unique request name
 * @param ServiceOrderUpdateExternalIn ServiceOrderObjectBaseData for ServiceOrderUpdateRequest
 *
 */
@JsonCreator
  public ServiceOrderUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseData ServiceOrderUpdateExternalIn) {
    super(id, "ServiceOrderUpdate");
    if (ServiceOrderUpdateExternalIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderUpdateExternalIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseData that results from the ServiceOrderUpdateRequest call
 * @return ServiceOrderObjectBaseData resulting from udt call
 *
 */

  public ServiceOrderObjectBaseData getOutput() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
}
