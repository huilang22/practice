/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapSubRequestParent.java
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
 * Abstract base class for all OpenItemIdMap related UdtSubRequestParents
 *
 */
public abstract class OpenItemIdMapSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOpenItemIdMapBalanceAccountInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OpenItemIdMap_Balance_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOpenItemIdMapInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OpenItemIdMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountBalancesSubRequestParent as an InputRequest
 * @param inputRequest AccountBalancesSubRequestParent to add as InputRequest
 *
 */
    public void addAccountBalancesOpenItemIdMapInputRequest(AccountBalancesSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountBalances_OpenItemIdMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOpenItemIdMapBalanceAccountInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_OpenItemIdMap_Balance_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOpenItemIdMapInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_OpenItemIdMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountBalanceSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountBalanceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountBalanceOpenItemIdMapInputRequest(OrderedAccountBalanceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccountBalance_OpenItemIdMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceOpenItemIdMapInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_OpenItemIdMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOpenItemIdMapInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_OpenItemIdMap_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OpenItemIdMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OpenItemIdMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OpenItemIdMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OpenItemIdMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOpenItemIdMapAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOpenItemIdMapAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOpenItemIdMapBalanceAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_Balance_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOpenItemIdMapBalanceAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_Balance_Account_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addOpenItemIdMapAccountBalancesSubRequest(AccountBalancesRequest subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_AccountBalances_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addOpenItemIdMapAccountBalancesSubRequest(AccountBalancesSubRequestParent subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_AccountBalances_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOpenItemIdMapBalanceOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_Balance_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOpenItemIdMapBalanceOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_Balance_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOpenItemIdMapOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOpenItemIdMapOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addOpenItemIdMapOrderedAccountBalanceSubRequest(OrderedAccountBalanceRequest subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addOpenItemIdMapOrderedAccountBalanceSubRequest(OrderedAccountBalanceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOpenItemIdMapOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOpenItemIdMapOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_OrderedService_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOpenItemIdMapServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOpenItemIdMapServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OpenItemIdMap_Service_Ref");
    }

/**
 *
 * Constructor for OpenItemIdMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OpenItemIdMapSubRequestParent(String id, String method) {
    super(id, "OpenItemIdMap", method);
  }
}
