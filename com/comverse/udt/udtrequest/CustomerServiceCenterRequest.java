/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CustomerServiceCenter related UdtRequests
 *
 */

public abstract class CustomerServiceCenterRequest extends UdtRequest {

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
 * Constructor for CustomerServiceCenterRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CustomerServiceCenterRequest(String id, String method) {
    super(id, "CustomerServiceCenter", method);
  }
}
