/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterSubRequestParent.java
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
 * Abstract base class for all CustomerServiceCenter related UdtSubRequestParents
 *
 */
public abstract class CustomerServiceCenterSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountCustomerServiceCenterInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_CustomerServiceCenter_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on CustomerServiceCenterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerServiceCenterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CustomerServiceCenterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerServiceCenterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addCustomerServiceCenterAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "CustomerServiceCenter_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addCustomerServiceCenterAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerServiceCenter_Account_Ref");
    }

/**
 *
 * Constructor for CustomerServiceCenterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CustomerServiceCenterSubRequestParent(String id, String method) {
    super(id, "CustomerServiceCenter", method);
  }
}
