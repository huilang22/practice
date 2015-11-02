/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all HqGroupContracts related UdtRequests
 *
 */

public abstract class HqGroupContractsRequest extends UdtRequest {

/**
 *
 * Constructor for HqGroupContractsRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public HqGroupContractsRequest(String id, String method) {
    super(id, "HqGroupContracts", method);
  }
}
