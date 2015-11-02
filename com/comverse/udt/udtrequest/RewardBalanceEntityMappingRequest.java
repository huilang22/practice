/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RewardBalanceEntityMapping related UdtRequests
 *
 */

public abstract class RewardBalanceEntityMappingRequest extends UdtRequest {

/**
 *
 * Constructor for RewardBalanceEntityMappingRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RewardBalanceEntityMappingRequest(String id, String method) {
    super(id, "RewardBalanceEntityMapping", method);
  }
}
