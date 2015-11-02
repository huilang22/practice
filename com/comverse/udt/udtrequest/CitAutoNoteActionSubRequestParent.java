/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionSubRequestParent.java
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
 * Abstract base class for all CitAutoNoteAction related UdtSubRequestParents
 *
 */
public abstract class CitAutoNoteActionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CitAutoNoteActionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitAutoNoteActionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CitAutoNoteActionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitAutoNoteActionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CitAutoNoteActionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CitAutoNoteActionSubRequestParent(String id, String method) {
    super(id, "CitAutoNoteAction", method);
  }
}
