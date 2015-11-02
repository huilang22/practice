/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterSubRequestParent.java
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
 * Abstract base class for all OwningCostCenter related UdtSubRequestParents
 *
 */
public abstract class OwningCostCenterSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on OwningCostCenterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OwningCostCenterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OwningCostCenterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OwningCostCenterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for OwningCostCenterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OwningCostCenterSubRequestParent(String id, String method) {
    super(id, "OwningCostCenter", method);
  }
}
