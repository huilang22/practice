/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTextRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NoteText related UdtRequests
 *
 */

public abstract class NoteTextRequest extends UdtRequest {

/**
 *
 * Constructor for NoteTextRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NoteTextRequest(String id, String method) {
    super(id, "NoteText", method);
  }
}
