/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PlanIdCredit related UdtRequests
 *
 */

public abstract class PlanIdCreditRequest extends UdtRequest {

/**
 *
 * Constructor for PlanIdCreditRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PlanIdCreditRequest(String id, String method) {
    super(id, "PlanIdCredit", method);
  }
}
