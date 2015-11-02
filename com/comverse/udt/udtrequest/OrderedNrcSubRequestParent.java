/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedNrcSubRequestParent.java
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
 * Abstract base class for all OrderedNrc related UdtSubRequestParents
 *
 */
public abstract class OrderedNrcSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderedNrcInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountBalancesSubRequestParent as an InputRequest
 * @param inputRequest AccountBalancesSubRequestParent to add as InputRequest
 *
 */
    public void addAccountBalancesOrderedNrcInputRequest(AccountBalancesSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountBalances_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractOrderedNrcInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementOrderedNrcInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemOrderedNrcInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcOrderedNrcChildInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_OrderedNrc_Child");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcOrderedNrcParentInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_OrderedNrc_Parent");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOrderedNrcInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountBalanceSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountBalanceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountBalanceOrderedNrcInputRequest(OrderedAccountBalanceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccountBalance_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractOrderedNrcInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryOrderedNrcInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceOrderedNrcInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  RefinancePlanSubRequestParent as an InputRequest
 * @param inputRequest RefinancePlanSubRequestParent to add as InputRequest
 *
 */
    public void addRefinancePlanOrderedNrcInputRequest(RefinancePlanSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "RefinancePlan_OrderedNrc_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderedNrcInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_OrderedNrc_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OrderedNrcRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedNrcRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedNrcSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedNrcSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedNrcAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedNrcAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Account_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addOrderedNrcAccountBalancesSubRequest(AccountBalancesRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_AccountBalances_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addOrderedNrcAccountBalancesSubRequest(AccountBalancesSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_AccountBalances_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOrderedNrcCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOrderedNrcCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_CustomerContract_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedNrcInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedNrcInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_InvElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedNrcItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedNrcItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Item_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedNrcChildSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Child");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedNrcChildSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Child");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedNrcParentSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Parent");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedNrcParentSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Parent");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedNrcOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedNrcOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addOrderedNrcOrderedAccountBalanceSubRequest(OrderedAccountBalanceRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addOrderedNrcOrderedAccountBalanceSubRequest(OrderedAccountBalanceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOrderedNrcOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOrderedNrcOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedNrcOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedNrcOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedNrcOrderedNrcChildSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedNrc_Child");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedNrcOrderedNrcChildSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedNrc_Child");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedNrcOrderedNrcParentSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedNrc_Parent");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedNrcOrderedNrcParentSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedNrc_Parent");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedNrcOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedNrcOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_OrderedService_Ref");
    }
/**
 *
 * Adds a RefinancePlanRequest sub request
 * @param subRequest RefinancePlanRequest
 *
 */
    public void addOrderedNrcRefinancePlanSubRequest(RefinancePlanRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_RefinancePlan_Ref");
    }
/**
 *
 * Adds a RefinancePlanRequest sub request
 * @param subRequest RefinancePlanRequest
 *
 */
    public void addOrderedNrcRefinancePlanSubRequest(RefinancePlanSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_RefinancePlan_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedNrcServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedNrcServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedNrc_Service_Ref");
    }

/**
 *
 * Constructor for OrderedNrcSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedNrcSubRequestParent(String id, String method) {
    super(id, "OrderedNrc", method);
  }
}
