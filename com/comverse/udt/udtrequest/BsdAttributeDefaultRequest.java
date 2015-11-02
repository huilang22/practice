/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdAttributeDefault related UdtRequests
 *
 */

public abstract class BsdAttributeDefaultRequest extends UdtRequest {

/**
 *
 * Constructor for BsdAttributeDefaultRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdAttributeDefaultRequest(String id, String method) {
    super(id, "BsdAttributeDefault", method);
  }
}
