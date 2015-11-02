/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all HqContractUnitCr related UdtRequests
 *
 */

public abstract class HqContractUnitCrRequest extends UdtRequest {

/**
 *
 * Constructor for HqContractUnitCrRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public HqContractUnitCrRequest(String id, String method) {
    super(id, "HqContractUnitCr", method);
  }
}
