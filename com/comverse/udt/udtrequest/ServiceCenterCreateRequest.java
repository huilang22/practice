/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterCreateRequest.java
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
 * Class used to create a ServiceCenterCreateRequest Udt Request
 *
 */

public class ServiceCenterCreateRequest extends ServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a  ServiceCenterCreateRequest
 * @param id Unique request name
 * @param SCCreateIn ServiceCenterObjectData for ServiceCenterCreateRequest
 *
 */
@JsonCreator
  public ServiceCenterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceCenter")ServiceCenterObjectData SCCreateIn) {
    super(id, "ServiceCenterCreate");
    if (SCCreateIn != null) {
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(SCCreateIn, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }

/**
 *
 * Retrieves the ServiceCenterObjectData that results from the ServiceCenterCreateRequest call
 * @return ServiceCenterObjectData resulting from udt call
 *
 */

  public ServiceCenterObjectData getOutput() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
}
