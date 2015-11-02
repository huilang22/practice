/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceSubRequestParent.java
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
 * Abstract base class for all AccountAbiSource related UdtSubRequestParents
 *
 */
public abstract class AccountAbiSourceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AccountAbiSourceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountAbiSourceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountAbiSourceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountAbiSourceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AccountAbiSourceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountAbiSourceSubRequestParent(String id, String method) {
    super(id, "AccountAbiSource", method);
  }
}
