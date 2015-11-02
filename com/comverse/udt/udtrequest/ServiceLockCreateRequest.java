/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceLockCreateRequest.java
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
 * Class used to create a ServiceLockCreateRequest Udt Request
 *
 */

public class ServiceLockCreateRequest extends LockManagerRequest {
/**
 *
 * Constructor to create a  ServiceLockCreateRequest
 * @param id Unique request name
 * @param ServiceInternalId Integer for ServiceLockCreateRequest
 * @param ServiceInternalIdResets Integer for ServiceLockCreateRequest
 * @param ServiceOrderId2 String for ServiceLockCreateRequest
 *
 */
@JsonCreator
  public ServiceLockCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceInternalId")Integer ServiceInternalId, @JsonProperty("ServiceInternalIdResets")Integer ServiceInternalIdResets, @JsonProperty("ServiceOrderId2")String ServiceOrderId2) {
    super(id, "ServiceLockCreate");
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
    if (ServiceOrderId2 != null) {
      addInput("ServiceOrderId2", ServiceOrderId2);
    }
  }

}
