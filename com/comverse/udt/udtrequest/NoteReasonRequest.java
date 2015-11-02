/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NoteReason related UdtRequests
 *
 */

public abstract class NoteReasonRequest extends UdtRequest {

/**
 *
 * Constructor for NoteReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NoteReasonRequest(String id, String method) {
    super(id, "NoteReason", method);
  }
}
