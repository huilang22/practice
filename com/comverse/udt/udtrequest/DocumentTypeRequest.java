/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all DocumentType related UdtRequests
 *
 */

public abstract class DocumentTypeRequest extends UdtRequest {

/**
 *
 * Constructor for DocumentTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DocumentTypeRequest(String id, String method) {
    super(id, "DocumentType", method);
  }
}
