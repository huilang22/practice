/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTextSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NoteText related UdtSubRequestParents
 *
 */
public abstract class NoteTextSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on NoteTextRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteTextRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on NoteTextSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteTextSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for NoteTextSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public NoteTextSubRequestParent(String id, String method) {
    super(id, "NoteText", method);
  }
}
