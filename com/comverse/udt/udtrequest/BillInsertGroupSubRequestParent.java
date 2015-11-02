/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupSubRequestParent.java
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
 * Abstract base class for all BillInsertGroup related UdtSubRequestParents
 *
 */
public abstract class BillInsertGroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillInsertGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillInsertGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillInsertGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillInsertGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillInsertGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillInsertGroupSubRequestParent(String id, String method) {
    super(id, "BillInsertGroup", method);
  }
}
