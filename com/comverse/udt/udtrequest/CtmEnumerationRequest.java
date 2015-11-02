/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtmEnumeration related UdtRequests
 *
 */

public abstract class CtmEnumerationRequest extends UdtRequest {

/**
 *
 * Constructor for CtmEnumerationRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtmEnumerationRequest(String id, String method) {
    super(id, "CtmEnumeration", method);
  }
}
