/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all DepositType related UdtRequests
 *
 */

public abstract class DepositTypeRequest extends UdtRequest {

/**
 *
 * Constructor for DepositTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DepositTypeRequest(String id, String method) {
    super(id, "DepositType", method);
  }
}
