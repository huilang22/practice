/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeRefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all DocumentTypeRef related UdtRequests
 *
 */

public abstract class DocumentTypeRefRequest extends UdtRequest {

/**
 *
 * Constructor for DocumentTypeRefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DocumentTypeRefRequest(String id, String method) {
    super(id, "DocumentTypeRef", method);
  }
}
