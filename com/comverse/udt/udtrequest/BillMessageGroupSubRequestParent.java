/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupSubRequestParent.java
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
 * Abstract base class for all BillMessageGroup related UdtSubRequestParents
 *
 */
public abstract class BillMessageGroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillMessageGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillMessageGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillMessageGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillMessageGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillMessageGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillMessageGroupSubRequestParent(String id, String method) {
    super(id, "BillMessageGroup", method);
  }
}
