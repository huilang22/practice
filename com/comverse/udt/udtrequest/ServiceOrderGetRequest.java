/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderGetRequest.java
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
 * Class used to create a ServiceOrderGetRequest Udt Request
 *
 */

public class ServiceOrderGetRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderGetRequest
 * @param id Unique request name
 * @param ServiceOrderGetIn ServiceOrderObjectBaseKeyData for ServiceOrderGetRequest
 *
 */
@JsonCreator
  public ServiceOrderGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseKeyData ServiceOrderGetIn) {
    super(id, "ServiceOrderGet");
    if (ServiceOrderGetIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderGetIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseData that results from the ServiceOrderGetRequest call
 * @return ServiceOrderObjectBaseData resulting from udt call
 *
 */

  public ServiceOrderObjectBaseData getOutput() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
}
