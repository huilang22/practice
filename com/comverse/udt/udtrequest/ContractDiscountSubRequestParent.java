/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractDiscountSubRequestParent.java
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
 * Abstract base class for all ContractDiscount related UdtSubRequestParents
 *
 */
public abstract class ContractDiscountSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ContractDiscountRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ContractDiscountRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ContractDiscountSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ContractDiscountSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ContractDiscountSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ContractDiscountSubRequestParent(String id, String method) {
    super(id, "ContractDiscount", method);
  }
}
