/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefValidateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PackageComponentDefValidate related UdtRequests
 *
 */

public abstract class PackageComponentDefValidateRequest extends UdtRequest {

/**
 *
 * Constructor for PackageComponentDefValidateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PackageComponentDefValidateRequest(String id, String method) {
    super(id, "PackageComponentDefValidate", method);
  }
}
