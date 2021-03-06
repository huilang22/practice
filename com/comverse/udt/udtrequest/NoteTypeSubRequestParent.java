/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeSubRequestParent.java
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
 * Abstract base class for all NoteType related UdtSubRequestParents
 *
 */
public abstract class NoteTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on NoteTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on NoteTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for NoteTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public NoteTypeSubRequestParent(String id, String method) {
    super(id, "NoteType", method);
  }
}
