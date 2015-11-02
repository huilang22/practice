/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterTypeGetRequest.java
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
 * Class used to create a ServiceCenterTypeGetRequest Udt Request
 *
 */

public class ServiceCenterTypeGetRequest extends ServiceCenterTypeSubRequestParent {
/**
 *
 * Constructor to create a  ServiceCenterTypeGetRequest
 * @param id Unique request name
 * @param SCTGetIn ServiceCenterTypeObjectKeyData for ServiceCenterTypeGetRequest
 *
 */
@JsonCreator
  public ServiceCenterTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceCenterType")ServiceCenterTypeObjectKeyData SCTGetIn) {
    super(id, "ServiceCenterTypeGet");
    if (SCTGetIn != null) {
      addInput("ServiceCenterType", ServiceCenterTypeObjectKeyHelper.toMap(SCTGetIn, new HashMap(), "ServiceCenterTypeObjectKeyData").get("ServiceCenterTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceCenterTypeObjectData that results from the ServiceCenterTypeGetRequest call
 * @return ServiceCenterTypeObjectData resulting from udt call
 *
 */

  public ServiceCenterTypeObjectData getOutput() {
    return ServiceCenterTypeObjectHelper.fromMap(outputMap, "ServiceCenterType");
  }
}
