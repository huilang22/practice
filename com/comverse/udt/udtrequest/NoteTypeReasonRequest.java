/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NoteTypeReason related UdtRequests
 *
 */

public abstract class NoteTypeReasonRequest extends UdtRequest {

/**
 *
 * Constructor for NoteTypeReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NoteTypeReasonRequest(String id, String method) {
    super(id, "NoteTypeReason", method);
  }
}
