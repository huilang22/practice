/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteSubRequestParent.java
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
 * Abstract base class for all EnhancedNote related UdtSubRequestParents
 *
 */
public abstract class EnhancedNoteSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on EnhancedNoteRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EnhancedNoteRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EnhancedNoteSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EnhancedNoteSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for EnhancedNoteSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EnhancedNoteSubRequestParent(String id, String method) {
    super(id, "EnhancedNote", method);
  }
}
