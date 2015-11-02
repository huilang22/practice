/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CmfPackageOverrides related UdtRequests
 *
 */

public abstract class CmfPackageOverridesRequest extends UdtRequest {

/**
 *
 * Constructor for CmfPackageOverridesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CmfPackageOverridesRequest(String id, String method) {
    super(id, "CmfPackageOverrides", method);
  }
}
