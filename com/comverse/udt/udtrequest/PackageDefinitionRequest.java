/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PackageDefinition related UdtRequests
 *
 */

public abstract class PackageDefinitionRequest extends UdtRequest {

/**
 *
 * Constructor for PackageDefinitionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PackageDefinitionRequest(String id, String method) {
    super(id, "PackageDefinition", method);
  }
}
