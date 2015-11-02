/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCreateRequest.java
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
 * Class used to create a ServiceOrderCreateRequest Udt Request
 *
 */

public class ServiceOrderCreateRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderCreateRequest
 * @param id Unique request name
 * @param ServiceOrderCreateIn ServiceOrderObjectBaseData for ServiceOrderCreateRequest
 *
 */
@JsonCreator
  public ServiceOrderCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseData ServiceOrderCreateIn) {
    super(id, "ServiceOrderCreate");
    if (ServiceOrderCreateIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderCreateIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseData that results from the ServiceOrderCreateRequest call
 * @return ServiceOrderObjectBaseData resulting from udt call
 *
 */

  public ServiceOrderObjectBaseData getOutput() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
}
