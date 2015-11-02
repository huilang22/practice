/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterDeleteRequest.java
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
 * Class used to create a ServiceCenterDeleteRequest Udt Request
 *
 */

public class ServiceCenterDeleteRequest extends ServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a  ServiceCenterDeleteRequest
 * @param id Unique request name
 * @param SCDeleteIn ServiceCenterObjectKeyData for ServiceCenterDeleteRequest
 *
 */
@JsonCreator
  public ServiceCenterDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceCenter")ServiceCenterObjectKeyData SCDeleteIn) {
    super(id, "ServiceCenterDelete");
    if (SCDeleteIn != null) {
      addInput("ServiceCenter", ServiceCenterObjectKeyHelper.toMap(SCDeleteIn, new HashMap(), "ServiceCenterObjectKeyData").get("ServiceCenterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceCenterObjectData that results from the ServiceCenterDeleteRequest call
 * @return ServiceCenterObjectData resulting from udt call
 *
 */

  public ServiceCenterObjectData getOutput() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
}
