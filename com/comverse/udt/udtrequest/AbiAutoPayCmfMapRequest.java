/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiAutoPayCmfMapRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AbiAutoPayCmfMap related UdtRequests
 *
 */

public abstract class AbiAutoPayCmfMapRequest extends UdtRequest {

/**
 *
 * Constructor for AbiAutoPayCmfMapRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AbiAutoPayCmfMapRequest(String id, String method) {
    super(id, "AbiAutoPayCmfMap", method);
  }
}
