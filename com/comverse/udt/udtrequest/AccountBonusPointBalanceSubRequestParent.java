/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointBalanceSubRequestParent.java
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
 * Abstract base class for all AccountBonusPointBalance related UdtSubRequestParents
 *
 */
public abstract class AccountBonusPointBalanceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AccountBonusPointBalanceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountBonusPointBalanceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountBonusPointBalanceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountBonusPointBalanceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AccountBonusPointBalanceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountBonusPointBalanceSubRequestParent(String id, String method) {
    super(id, "AccountBonusPointBalance", method);
  }
}
