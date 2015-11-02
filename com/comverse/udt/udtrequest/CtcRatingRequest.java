/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcRating related UdtRequests
 *
 */

public abstract class CtcRatingRequest extends UdtRequest {

/**
 *
 * Constructor for CtcRatingRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcRatingRequest(String id, String method) {
    super(id, "CtcRating", method);
  }
}
