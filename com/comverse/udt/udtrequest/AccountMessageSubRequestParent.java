/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageSubRequestParent.java
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
 * Abstract base class for all AccountMessage related UdtSubRequestParents
 *
 */
public abstract class AccountMessageSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AccountMessageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountMessageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountMessageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountMessageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AccountMessageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountMessageSubRequestParent(String id, String method) {
    super(id, "AccountMessage", method);
  }
}
