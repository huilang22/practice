/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeDefaultRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdApplicationAttributeDefault related UdtRequests
 *
 */

public abstract class BsdApplicationAttributeDefaultRequest extends UdtRequest {

/**
 *
 * Constructor for BsdApplicationAttributeDefaultRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdApplicationAttributeDefaultRequest(String id, String method) {
    super(id, "BsdApplicationAttributeDefault", method);
  }
}
