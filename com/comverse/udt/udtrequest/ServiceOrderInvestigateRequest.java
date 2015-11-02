/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvestigateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceOrderInvestigate related UdtRequests
 *
 */

public abstract class ServiceOrderInvestigateRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceOrderInvestigateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceOrderInvestigateRequest(String id, String method) {
    super(id, "ServiceOrderInvestigate", method);
  }
}
