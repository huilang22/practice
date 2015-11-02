/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentSubRequestParent.java
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
 * Abstract base class for all Component related UdtSubRequestParents
 *
 */
public abstract class ComponentSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountComponentInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Component_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentElementSubRequestParent as an InputRequest
 * @param inputRequest ComponentElementSubRequestParent to add as InputRequest
 *
 */
    public void addComponentElementComponentInputRequest(ComponentElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ComponentElement_Component_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemComponentInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_Component_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountComponentInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Component_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedPackageSubRequestParent as an InputRequest
 * @param inputRequest OrderedPackageSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedPackageComponentInputRequest(OrderedPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedPackage_Component_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceComponentInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_Component_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductPackageSubRequestParent as an InputRequest
 * @param inputRequest ProductPackageSubRequestParent to add as InputRequest
 *
 */
    public void addProductPackageComponentInputRequest(ProductPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ProductPackage_Component_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceComponentInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_Component_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ComponentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ComponentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ComponentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ComponentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addComponentAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Component_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addComponentAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Component_Account_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addComponentComponentElementSubRequest(ComponentElementRequest subRequest) {
      addSubRequest(subRequest, "Component_ComponentElement_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addComponentComponentElementSubRequest(ComponentElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "Component_ComponentElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addComponentItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "Component_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addComponentItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "Component_Item_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addComponentOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Component_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addComponentOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Component_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addComponentOrderedPackageSubRequest(OrderedPackageRequest subRequest) {
      addSubRequest(subRequest, "Component_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addComponentOrderedPackageSubRequest(OrderedPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Component_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addComponentOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "Component_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addComponentOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Component_OrderedService_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addComponentProductPackageSubRequest(ProductPackageRequest subRequest) {
      addSubRequest(subRequest, "Component_ProductPackage_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addComponentProductPackageSubRequest(ProductPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Component_ProductPackage_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addComponentServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "Component_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addComponentServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Component_Service_Ref");
    }

/**
 *
 * Constructor for ComponentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ComponentSubRequestParent(String id, String method) {
    super(id, "Component", method);
  }
}
