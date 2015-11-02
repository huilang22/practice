/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderLogicalExpandRequest.java
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
 * Class used to create a ServiceOrderLogicalExpandRequest Udt Request
 *
 */

public class ServiceOrderLogicalExpandRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderLogicalExpandRequest
 * @param id Unique request name
 * @param ServiceOrderLogicalExpandIn ServiceOrderObjectBaseKeyData for ServiceOrderLogicalExpandRequest
 *
 */
@JsonCreator
  public ServiceOrderLogicalExpandRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseKeyData ServiceOrderLogicalExpandIn) {
    super(id, "ServiceOrderLogicalExpand");
    if (ServiceOrderLogicalExpandIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderLogicalExpandIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseData that results from the ServiceOrderLogicalExpandRequest call
 * @return ServiceOrderObjectBaseData resulting from udt call
 *
 */

  public ServiceOrderObjectBaseData getOutput() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
}
