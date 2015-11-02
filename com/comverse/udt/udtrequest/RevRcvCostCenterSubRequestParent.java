/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterSubRequestParent.java
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
 * Abstract base class for all RevRcvCostCenter related UdtSubRequestParents
 *
 */
public abstract class RevRcvCostCenterSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RevRcvCostCenterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RevRcvCostCenterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RevRcvCostCenterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RevRcvCostCenterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RevRcvCostCenterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RevRcvCostCenterSubRequestParent(String id, String method) {
    super(id, "RevRcvCostCenter", method);
  }
}
