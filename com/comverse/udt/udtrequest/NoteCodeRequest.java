/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NoteCode related UdtRequests
 *
 */

public abstract class NoteCodeRequest extends UdtRequest {

/**
 *
 * Constructor for NoteCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NoteCodeRequest(String id, String method) {
    super(id, "NoteCode", method);
  }
}
