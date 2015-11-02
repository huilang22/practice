/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceablePackageTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceablePackageType related UdtRequests
 *
 */

public abstract class ServiceablePackageTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServiceablePackageTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServiceablePackageTypeRequest(String id, String method) {
    super(id, "ServiceablePackageType", method);
  }
}
