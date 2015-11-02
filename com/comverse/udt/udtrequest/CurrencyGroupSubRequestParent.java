/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupSubRequestParent.java
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
 * Abstract base class for all CurrencyGroup related UdtSubRequestParents
 *
 */
public abstract class CurrencyGroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CurrencyGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CurrencyGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CurrencyGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CurrencyGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CurrencyGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CurrencyGroupSubRequestParent(String id, String method) {
    super(id, "CurrencyGroup", method);
  }
}
