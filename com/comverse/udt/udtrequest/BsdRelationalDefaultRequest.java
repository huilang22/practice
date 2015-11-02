/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdRelationalDefault related UdtRequests
 *
 */

public abstract class BsdRelationalDefaultRequest extends UdtRequest {

/**
 *
 * Constructor for BsdRelationalDefaultRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdRelationalDefaultRequest(String id, String method) {
    super(id, "BsdRelationalDefault", method);
  }
}
