/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeTypesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all LateFeeTypes related UdtRequests
 *
 */

public abstract class LateFeeTypesRequest extends UdtRequest {

/**
 *
 * Constructor for LateFeeTypesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public LateFeeTypesRequest(String id, String method) {
    super(id, "LateFeeTypes", method);
  }
}
