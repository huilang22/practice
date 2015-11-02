/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupMapSubRequestParent.java
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
 * Abstract base class for all BillMessageGroupMap related UdtSubRequestParents
 *
 */
public abstract class BillMessageGroupMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillMessageGroupMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillMessageGroupMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillMessageGroupMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillMessageGroupMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillMessageGroupMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillMessageGroupMapSubRequestParent(String id, String method) {
    super(id, "BillMessageGroupMap", method);
  }
}
