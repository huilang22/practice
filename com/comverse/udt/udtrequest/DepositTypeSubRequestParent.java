/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeSubRequestParent.java
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
 * Abstract base class for all DepositType related UdtSubRequestParents
 *
 */
public abstract class DepositTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DepositTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DepositTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DepositTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DepositTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DepositTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DepositTypeSubRequestParent(String id, String method) {
    super(id, "DepositType", method);
  }
}
