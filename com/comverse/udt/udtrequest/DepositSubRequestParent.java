/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositSubRequestParent.java
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
 * Abstract base class for all Deposit related UdtSubRequestParents
 *
 */
public abstract class DepositSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountDepositInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Deposit_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountDepositInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Deposit_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on DepositRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DepositRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DepositSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DepositSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addDepositAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Deposit_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addDepositAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Deposit_Account_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addDepositOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Deposit_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addDepositOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Deposit_OrderedAccount_Ref");
    }

/**
 *
 * Constructor for DepositSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DepositSubRequestParent(String id, String method) {
    super(id, "Deposit", method);
  }
}
