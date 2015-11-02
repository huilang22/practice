/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcGenre related UdtRequests
 *
 */

public abstract class CtcGenreRequest extends UdtRequest {

/**
 *
 * Constructor for CtcGenreRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcGenreRequest(String id, String method) {
    super(id, "CtcGenre", method);
  }
}
