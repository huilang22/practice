/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcCmfPackageRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SvcCmfPackage related UdtRequests
 *
 */

public abstract class SvcCmfPackageRequest extends UdtRequest {

/**
 *
 * Constructor for SvcCmfPackageRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SvcCmfPackageRequest(String id, String method) {
    super(id, "SvcCmfPackage", method);
  }
}
