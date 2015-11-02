/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CsrAccountSegment related UdtRequests
 *
 */

public abstract class CsrAccountSegmentRequest extends UdtRequest {

/**
 *
 * Constructor for CsrAccountSegmentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CsrAccountSegmentRequest(String id, String method) {
    super(id, "CsrAccountSegment", method);
  }
}
