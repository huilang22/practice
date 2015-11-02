/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterGetRequest.java
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
 * Class used to create a ServiceCenterGetRequest Udt Request
 *
 */

public class ServiceCenterGetRequest extends ServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a  ServiceCenterGetRequest
 * @param id Unique request name
 * @param SCGetIn ServiceCenterObjectKeyData for ServiceCenterGetRequest
 *
 */
@JsonCreator
  public ServiceCenterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceCenter")ServiceCenterObjectKeyData SCGetIn) {
    super(id, "ServiceCenterGet");
    if (SCGetIn != null) {
      addInput("ServiceCenter", ServiceCenterObjectKeyHelper.toMap(SCGetIn, new HashMap(), "ServiceCenterObjectKeyData").get("ServiceCenterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceCenterObjectData that results from the ServiceCenterGetRequest call
 * @return ServiceCenterObjectData resulting from udt call
 *
 */

  public ServiceCenterObjectData getOutput() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
}
