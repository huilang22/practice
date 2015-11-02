/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeSubRequestParent.java
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
 * Abstract base class for all FranchiseCode related UdtSubRequestParents
 *
 */
public abstract class FranchiseCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on FranchiseCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(FranchiseCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on FranchiseCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(FranchiseCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for FranchiseCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public FranchiseCodeSubRequestParent(String id, String method) {
    super(id, "FranchiseCode", method);
  }
}
