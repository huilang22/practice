/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceMasterGroupCreateRequest.java
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
 * Class used to create a ServiceMasterGroupCreateRequest Udt Request
 *
 */

public class ServiceMasterGroupCreateRequest extends ServiceMasterGroupSubRequestParent {
/**
 *
 * Constructor to create a  ServiceMasterGroupCreateRequest
 * @param id Unique request name
 * @param EMGcreateIn ServiceMasterGroupObjectData for ServiceMasterGroupCreateRequest
 *
 */
@JsonCreator
  public ServiceMasterGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceMasterGroup")ServiceMasterGroupObjectData EMGcreateIn) {
    super(id, "ServiceMasterGroupCreate");
    if (EMGcreateIn != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(EMGcreateIn, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }

/**
 *
 * Retrieves the ServiceMasterGroupObjectData that results from the ServiceMasterGroupCreateRequest call
 * @return ServiceMasterGroupObjectData resulting from udt call
 *
 */

  public ServiceMasterGroupObjectData getOutput() {
    return ServiceMasterGroupObjectHelper.fromMap(outputMap, "ServiceMasterGroup");
  }
}
