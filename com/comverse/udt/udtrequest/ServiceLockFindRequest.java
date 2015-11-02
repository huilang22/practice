/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceLockFindRequest.java
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
 * Class used to create a ServiceLockFindRequest Udt Request
 *
 */

public class ServiceLockFindRequest extends LockManagerRequest {
/**
 *
 * Constructor to create a  ServiceLockFindRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public ServiceLockFindRequest(@JsonProperty("RequestId") String id) {
    super(id, "ServiceLockFind");
  }

}
