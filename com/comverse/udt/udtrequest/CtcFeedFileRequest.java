/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcFeedFile related UdtRequests
 *
 */

public abstract class CtcFeedFileRequest extends UdtRequest {

/**
 *
 * Constructor for CtcFeedFileRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcFeedFileRequest(String id, String method) {
    super(id, "CtcFeedFile", method);
  }
}
