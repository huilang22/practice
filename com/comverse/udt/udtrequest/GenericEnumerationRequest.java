/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GenericEnumeration related UdtRequests
 *
 */

public abstract class GenericEnumerationRequest extends UdtRequest {

/**
 *
 * Constructor for GenericEnumerationRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GenericEnumerationRequest(String id, String method) {
    super(id, "GenericEnumeration", method);
  }
}
