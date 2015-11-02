/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndSubRequestParent.java
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
 * Abstract base class for all InvdReserveEnd related UdtSubRequestParents
 *
 */
public abstract class InvdReserveEndSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvdReserveEndRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdReserveEndRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvdReserveEndSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdReserveEndSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvdReserveEndSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvdReserveEndSubRequestParent(String id, String method) {
    super(id, "InvdReserveEnd", method);
  }
}
