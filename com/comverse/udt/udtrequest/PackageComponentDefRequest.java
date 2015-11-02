/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PackageComponentDef related UdtRequests
 *
 */

public abstract class PackageComponentDefRequest extends UdtRequest {

/**
 *
 * Constructor for PackageComponentDefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PackageComponentDefRequest(String id, String method) {
    super(id, "PackageComponentDef", method);
  }
}
