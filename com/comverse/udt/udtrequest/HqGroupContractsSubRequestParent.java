/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsSubRequestParent.java
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
 * Abstract base class for all HqGroupContracts related UdtSubRequestParents
 *
 */
public abstract class HqGroupContractsSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on HqGroupContractsRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqGroupContractsRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on HqGroupContractsSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqGroupContractsSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for HqGroupContractsSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public HqGroupContractsSubRequestParent(String id, String method) {
    super(id, "HqGroupContracts", method);
  }
}
