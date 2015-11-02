/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsSubRequestParent.java
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
 * Abstract base class for all InvdViews related UdtSubRequestParents
 *
 */
public abstract class InvdViewsSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvdViewsRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdViewsRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvdViewsSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdViewsSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvdViewsSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvdViewsSubRequestParent(String id, String method) {
    super(id, "InvdViews", method);
  }
}
