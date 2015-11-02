/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CustomerDocument related UdtRequests
 *
 */

public abstract class CustomerDocumentRequest extends UdtRequest {

/**
 *
 * Constructor for CustomerDocumentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CustomerDocumentRequest(String id, String method) {
    super(id, "CustomerDocument", method);
  }
}
