/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditSubRequestParent.java
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
 * Abstract base class for all ContractUnitCredit related UdtSubRequestParents
 *
 */
public abstract class ContractUnitCreditSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractContractUnitCreditInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_ContractUnitCredit_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractContractUnitCreditInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_ContractUnitCredit_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ContractUnitCreditRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ContractUnitCreditRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ContractUnitCreditSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ContractUnitCreditSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addContractUnitCreditCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "ContractUnitCredit_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addContractUnitCreditCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "ContractUnitCredit_CustomerContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addContractUnitCreditOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "ContractUnitCredit_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addContractUnitCreditOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "ContractUnitCredit_OrderedContract_Ref");
    }

/**
 *
 * Constructor for ContractUnitCreditSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ContractUnitCreditSubRequestParent(String id, String method) {
    super(id, "ContractUnitCredit", method);
  }
}
