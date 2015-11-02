/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NoteTemplate related UdtRequests
 *
 */

public abstract class NoteTemplateRequest extends UdtRequest {

/**
 *
 * Constructor for NoteTemplateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NoteTemplateRequest(String id, String method) {
    super(id, "NoteTemplate", method);
  }
}
