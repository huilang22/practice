/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceMasterGroupUpdateRequest.java
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
 * Class used to create a ServiceMasterGroupUpdateRequest Udt Request
 *
 */

public class ServiceMasterGroupUpdateRequest extends ServiceMasterGroupSubRequestParent {
/**
 *
 * Constructor to create a  ServiceMasterGroupUpdateRequest
 * @param id Unique request name
 * @param EMGupdateIn ServiceMasterGroupObjectData for ServiceMasterGroupUpdateRequest
 *
 */
@JsonCreator
  public ServiceMasterGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceMasterGroup")ServiceMasterGroupObjectData EMGupdateIn) {
    super(id, "ServiceMasterGroupUpdate");
    if (EMGupdateIn != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(EMGupdateIn, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }

/**
 *
 * Retrieves the ServiceMasterGroupObjectData that results from the ServiceMasterGroupUpdateRequest call
 * @return ServiceMasterGroupObjectData resulting from udt call
 *
 */

  public ServiceMasterGroupObjectData getOutput() {
    return ServiceMasterGroupObjectHelper.fromMap(outputMap, "ServiceMasterGroup");
  }
}
