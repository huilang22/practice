/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterUpdateRequest.java
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
 * Class used to create a ServiceCenterUpdateRequest Udt Request
 *
 */

public class ServiceCenterUpdateRequest extends ServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a  ServiceCenterUpdateRequest
 * @param id Unique request name
 * @param SCUpdateIn ServiceCenterObjectData for ServiceCenterUpdateRequest
 *
 */
@JsonCreator
  public ServiceCenterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceCenter")ServiceCenterObjectData SCUpdateIn) {
    super(id, "ServiceCenterUpdate");
    if (SCUpdateIn != null) {
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(SCUpdateIn, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }

/**
 *
 * Retrieves the ServiceCenterObjectData that results from the ServiceCenterUpdateRequest call
 * @return ServiceCenterObjectData resulting from udt call
 *
 */

  public ServiceCenterObjectData getOutput() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
}
