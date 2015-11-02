/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BoundarySubRequestParent.java
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
 * Abstract base class for all Boundary related UdtSubRequestParents
 *
 */
public abstract class BoundarySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BoundaryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BoundaryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BoundarySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BoundarySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BoundarySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BoundarySubRequestParent(String id, String method) {
    super(id, "Boundary", method);
  }
}
