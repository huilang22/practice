/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableInvElementRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceableInvElement related UdtRequests
 *
 */

public abstract class ServiceableInvElementRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceableInvElementRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceableInvElementRequest(String id, String method) {
    super(id, "ServiceableInvElement", method);
  }
}
