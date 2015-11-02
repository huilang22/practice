/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteCodeSubRequestParent.java
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
 * Abstract base class for all NoteCode related UdtSubRequestParents
 *
 */
public abstract class NoteCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on NoteCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on NoteCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for NoteCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public NoteCodeSubRequestParent(String id, String method) {
    super(id, "NoteCode", method);
  }
}
