/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceMasterGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceMasterGroup related UdtRequests
 *
 */

public abstract class ServiceMasterGroupRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceMasterGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceMasterGroupRequest(String id, String method) {
    super(id, "ServiceMasterGroup", method);
  }
}
