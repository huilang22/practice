/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeSubRequestParent.java
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
 * Abstract base class for all AccountCode related UdtSubRequestParents
 *
 */
public abstract class AccountCodeSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountCodeGroupSubRequestParent as an InputRequest
 * @param inputRequest AccountCodeGroupSubRequestParent to add as InputRequest
 *
 */
    public void addAccountCodeGroupAccountCodeInputRequest(AccountCodeGroupSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountCodeGroup_AccountCode_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on AccountCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addAccountCodeAccountCodeGroupSubRequest(AccountCodeGroupRequest subRequest) {
      addSubRequest(subRequest, "AccountCode_AccountCodeGroup_Ref");
    }
/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addAccountCodeAccountCodeGroupSubRequest(AccountCodeGroupSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountCode_AccountCodeGroup_Ref");
    }

/**
 *
 * Constructor for AccountCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountCodeSubRequestParent(String id, String method) {
    super(id, "AccountCode", method);
  }
}
