/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvElement related UdtRequests
 *
 */

public abstract class InvElementRequest extends UdtRequest {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountInvElementInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountReservedInvElementInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Reserved_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerIdEquipMapSubRequestParent as an InputRequest
 * @param inputRequest CustomerIdEquipMapSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerIdEquipMapInvElementInputRequest(CustomerIdEquipMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerIdEquipMap_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemInvElementInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcInvElementInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountInvElementInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountReservedInvElementInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Reserved_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedCiemSubRequestParent as an InputRequest
 * @param inputRequest OrderedCiemSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedCiemInvElementInputRequest(OrderedCiemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedCiem_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcInvElementInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductInvElementInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceInvElementInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductInvElementInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceInvElementInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  VanityCodeChargeMapSubRequestParent as an InputRequest
 * @param inputRequest VanityCodeChargeMapSubRequestParent to add as InputRequest
 *
 */
    public void addVanityCodeChargeMapInvElementInputRequest(VanityCodeChargeMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "VanityCodeChargeMap_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Constructor for InvElementRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvElementRequest(String id, String method) {
    super(id, "InvElement", method);
  }
}
