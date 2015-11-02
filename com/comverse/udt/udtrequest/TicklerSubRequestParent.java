/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerSubRequestParent.java
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
 * Abstract base class for all Tickler related UdtSubRequestParents
 *
 */
public abstract class TicklerSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TicklerRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TicklerRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TicklerSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TicklerSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TicklerSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TicklerSubRequestParent(String id, String method) {
    super(id, "Tickler", method);
  }
}
