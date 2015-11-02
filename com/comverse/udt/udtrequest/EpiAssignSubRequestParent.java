/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignSubRequestParent.java
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
 * Abstract base class for all EpiAssign related UdtSubRequestParents
 *
 */
public abstract class EpiAssignSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on EpiAssignRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EpiAssignRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EpiAssignSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EpiAssignSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for EpiAssignSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EpiAssignSubRequestParent(String id, String method) {
    super(id, "EpiAssign", method);
  }
}
