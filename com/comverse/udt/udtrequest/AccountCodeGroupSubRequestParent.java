/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupSubRequestParent.java
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
 * Abstract base class for all AccountCodeGroup related UdtSubRequestParents
 *
 */
public abstract class AccountCodeGroupSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountAccountCodeGroupInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_AccountCodeGroup_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountCodeSubRequestParent as an InputRequest
 * @param inputRequest AccountCodeSubRequestParent to add as InputRequest
 *
 */
    public void addAccountCodeAccountCodeGroupInputRequest(AccountCodeSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountCode_AccountCodeGroup_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountAccountCodeGroupInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_AccountCodeGroup_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on AccountCodeGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountCodeGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountCodeGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountCodeGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountCodeGroupAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountCodeGroupAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_Account_Ref");
    }
/**
 *
 * Adds a AccountCodeRequest sub request
 * @param subRequest AccountCodeRequest
 *
 */
    public void addAccountCodeGroupAccountCodeSubRequest(AccountCodeRequest subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_AccountCode_Ref");
    }
/**
 *
 * Adds a AccountCodeRequest sub request
 * @param subRequest AccountCodeRequest
 *
 */
    public void addAccountCodeGroupAccountCodeSubRequest(AccountCodeSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_AccountCode_Ref");
    }
/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addAccountCodeGroupChildSubRequest(AccountCodeGroupRequest subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_Child");
    }
/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addAccountCodeGroupChildSubRequest(AccountCodeGroupSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_Child");
    }
/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addAccountCodeGroupParentSubRequest(AccountCodeGroupRequest subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_Parent");
    }
/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addAccountCodeGroupParentSubRequest(AccountCodeGroupSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_Parent");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addAccountCodeGroupOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addAccountCodeGroupOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountCodeGroup_OrderedAccount_Ref");
    }

/**
 *
 * Constructor for AccountCodeGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountCodeGroupSubRequestParent(String id, String method) {
    super(id, "AccountCodeGroup", method);
  }
}
