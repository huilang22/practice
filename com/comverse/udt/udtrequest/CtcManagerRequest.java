/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcManagerRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcManager related UdtRequests
 *
 */

public abstract class CtcManagerRequest extends UdtRequest {

/**
 *
 * Constructor for CtcManagerRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcManagerRequest(String id, String method) {
    super(id, "CtcManager", method);
  }
}
