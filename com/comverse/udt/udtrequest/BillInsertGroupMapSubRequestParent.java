/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapSubRequestParent.java
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
 * Abstract base class for all BillInsertGroupMap related UdtSubRequestParents
 *
 */
public abstract class BillInsertGroupMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillInsertGroupMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillInsertGroupMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillInsertGroupMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillInsertGroupMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillInsertGroupMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillInsertGroupMapSubRequestParent(String id, String method) {
    super(id, "BillInsertGroupMap", method);
  }
}
