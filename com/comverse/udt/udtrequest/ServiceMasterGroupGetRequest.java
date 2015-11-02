/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceMasterGroupGetRequest.java
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
 * Class used to create a ServiceMasterGroupGetRequest Udt Request
 *
 */

public class ServiceMasterGroupGetRequest extends ServiceMasterGroupSubRequestParent {
/**
 *
 * Constructor to create a  ServiceMasterGroupGetRequest
 * @param id Unique request name
 * @param EMGgetIn ServiceMasterGroupObjectKeyData for ServiceMasterGroupGetRequest
 *
 */
@JsonCreator
  public ServiceMasterGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceMasterGroup")ServiceMasterGroupObjectKeyData EMGgetIn) {
    super(id, "ServiceMasterGroupGet");
    if (EMGgetIn != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectKeyHelper.toMap(EMGgetIn, new HashMap(), "ServiceMasterGroupObjectKeyData").get("ServiceMasterGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceMasterGroupObjectData that results from the ServiceMasterGroupGetRequest call
 * @return ServiceMasterGroupObjectData resulting from udt call
 *
 */

  public ServiceMasterGroupObjectData getOutput() {
    return ServiceMasterGroupObjectHelper.fromMap(outputMap, "ServiceMasterGroup");
  }
}
