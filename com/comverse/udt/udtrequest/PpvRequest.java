/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Ppv related UdtRequests
 *
 */

public abstract class PpvRequest extends UdtRequest {

/**
 *
 * Constructor for PpvRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PpvRequest(String id, String method) {
    super(id, "Ppv", method);
  }
}
