/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PackageGroup related UdtRequests
 *
 */

public abstract class PackageGroupRequest extends UdtRequest {

/**
 *
 * Constructor for PackageGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PackageGroupRequest(String id, String method) {
    super(id, "PackageGroup", method);
  }
}
