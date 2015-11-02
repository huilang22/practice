/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAutoAssocRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AdrAutoAssoc related UdtRequests
 *
 */

public abstract class AdrAutoAssocRequest extends UdtRequest {

/**
 *
 * Constructor for AdrAutoAssocRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AdrAutoAssocRequest(String id, String method) {
    super(id, "AdrAutoAssoc", method);
  }
}
