/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AtmPoplist related UdtRequests
 *
 */

public abstract class AtmPoplistRequest extends UdtRequest {

/**
 *
 * Constructor for AtmPoplistRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AtmPoplistRequest(String id, String method) {
    super(id, "AtmPoplist", method);
  }
}
