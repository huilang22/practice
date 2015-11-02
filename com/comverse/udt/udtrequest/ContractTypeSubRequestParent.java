/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeSubRequestParent.java
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
 * Abstract base class for all ContractType related UdtSubRequestParents
 *
 */
public abstract class ContractTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ContractTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ContractTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ContractTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ContractTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ContractTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ContractTypeSubRequestParent(String id, String method) {
    super(id, "ContractType", method);
  }
}
