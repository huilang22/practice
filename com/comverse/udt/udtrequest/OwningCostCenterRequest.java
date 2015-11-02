/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OwningCostCenter related UdtRequests
 *
 */

public abstract class OwningCostCenterRequest extends UdtRequest {

/**
 *
 * Constructor for OwningCostCenterRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public OwningCostCenterRequest(String id, String method) {
    super(id, "OwningCostCenter", method);
  }
}
