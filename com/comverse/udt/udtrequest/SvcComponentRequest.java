/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcComponentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SvcComponent related UdtRequests
 *
 */

public abstract class SvcComponentRequest extends UdtRequest {

/**
 *
 * Constructor for SvcComponentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SvcComponentRequest(String id, String method) {
    super(id, "SvcComponent", method);
  }
}
