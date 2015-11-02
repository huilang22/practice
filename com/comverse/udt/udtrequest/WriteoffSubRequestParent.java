/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffSubRequestParent.java
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
 * Abstract base class for all Writeoff related UdtSubRequestParents
 *
 */
public abstract class WriteoffSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on WriteoffRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WriteoffRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on WriteoffSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WriteoffSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for WriteoffSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public WriteoffSubRequestParent(String id, String method) {
    super(id, "Writeoff", method);
  }
}
