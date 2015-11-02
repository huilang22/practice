/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedComponentSubRequestParent.java
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
 * Abstract base class for all OrderedComponent related UdtSubRequestParents
 *
 */
public abstract class OrderedComponentSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderedComponentInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OrderedComponent_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentElementSubRequestParent as an InputRequest
 * @param inputRequest ComponentElementSubRequestParent to add as InputRequest
 *
 */
    public void addComponentElementOrderedComponentInputRequest(ComponentElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ComponentElement_OrderedComponent_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemOrderedComponentInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_OrderedComponent_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOrderedComponentInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_OrderedComponent_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedPackageSubRequestParent as an InputRequest
 * @param inputRequest OrderedPackageSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedPackageOrderedComponentInputRequest(OrderedPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedPackage_OrderedComponent_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceOrderedComponentInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_OrderedComponent_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductPackageSubRequestParent as an InputRequest
 * @param inputRequest ProductPackageSubRequestParent to add as InputRequest
 *
 */
    public void addProductPackageOrderedComponentInputRequest(ProductPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ProductPackage_OrderedComponent_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderedComponentInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_OrderedComponent_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OrderedComponentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedComponentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedComponentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedComponentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedComponentAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedComponent_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedComponentAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedComponent_Account_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addOrderedComponentComponentElementSubRequest(ComponentElementRequest subRequest) {
      addSubRequest(subRequest, "OrderedComponent_ComponentElement_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addOrderedComponentComponentElementSubRequest(ComponentElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedComponent_ComponentElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedComponentItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "OrderedComponent_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedComponentItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedComponent_Item_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedComponentOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedComponent_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedComponentOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedComponent_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addOrderedComponentOrderedPackageSubRequest(OrderedPackageRequest subRequest) {
      addSubRequest(subRequest, "OrderedComponent_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addOrderedComponentOrderedPackageSubRequest(OrderedPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedComponent_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedComponentOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedComponent_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedComponentOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedComponent_OrderedService_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addOrderedComponentProductPackageSubRequest(ProductPackageRequest subRequest) {
      addSubRequest(subRequest, "OrderedComponent_ProductPackage_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addOrderedComponentProductPackageSubRequest(ProductPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedComponent_ProductPackage_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedComponentServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedComponent_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedComponentServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedComponent_Service_Ref");
    }

/**
 *
 * Constructor for OrderedComponentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedComponentSubRequestParent(String id, String method) {
    super(id, "OrderedComponent", method);
  }
}
