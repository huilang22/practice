/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertSubRequestParent.java
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
 * Abstract base class for all AccountInsert related UdtSubRequestParents
 *
 */
public abstract class AccountInsertSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AccountInsertRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountInsertRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountInsertSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountInsertSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AccountInsertSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountInsertSubRequestParent(String id, String method) {
    super(id, "AccountInsert", method);
  }
}
