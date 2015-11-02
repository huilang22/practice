/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AccountCode related UdtRequests
 *
 */

public abstract class AccountCodeRequest extends UdtRequest {

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
 * Constructor for AccountCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AccountCodeRequest(String id, String method) {
    super(id, "AccountCode", method);
  }
}
