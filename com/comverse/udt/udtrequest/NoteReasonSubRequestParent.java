/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonSubRequestParent.java
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
 * Abstract base class for all NoteReason related UdtSubRequestParents
 *
 */
public abstract class NoteReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on NoteReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on NoteReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for NoteReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public NoteReasonSubRequestParent(String id, String method) {
    super(id, "NoteReason", method);
  }
}
