/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonSubRequestParent.java
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
 * Abstract base class for all NoteTypeReason related UdtSubRequestParents
 *
 */
public abstract class NoteTypeReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on NoteTypeReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteTypeReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on NoteTypeReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NoteTypeReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for NoteTypeReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public NoteTypeReasonSubRequestParent(String id, String method) {
    super(id, "NoteTypeReason", method);
  }
}
