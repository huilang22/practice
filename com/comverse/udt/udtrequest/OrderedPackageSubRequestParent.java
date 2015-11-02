/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPackageSubRequestParent.java
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
 * Abstract base class for all OrderedPackage related UdtSubRequestParents
 *
 */
public abstract class OrderedPackageSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderedPackageInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OrderedPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentSubRequestParent as an InputRequest
 * @param inputRequest ComponentSubRequestParent to add as InputRequest
 *
 */
    public void addComponentOrderedPackageInputRequest(ComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Component_OrderedPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentElementSubRequestParent as an InputRequest
 * @param inputRequest ComponentElementSubRequestParent to add as InputRequest
 *
 */
    public void addComponentElementOrderedPackageInputRequest(ComponentElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ComponentElement_OrderedPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemOrderedPackageInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_OrderedPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOrderedPackageInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_OrderedPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedComponentSubRequestParent as an InputRequest
 * @param inputRequest OrderedComponentSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedComponentOrderedPackageInputRequest(OrderedComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedComponent_OrderedPackage_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OrderedPackageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedPackageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedPackageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedPackageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedPackageAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedPackage_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedPackageAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedPackage_Account_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addOrderedPackageComponentSubRequest(ComponentRequest subRequest) {
      addSubRequest(subRequest, "OrderedPackage_Component_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addOrderedPackageComponentSubRequest(ComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedPackage_Component_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addOrderedPackageComponentElementSubRequest(ComponentElementRequest subRequest) {
      addSubRequest(subRequest, "OrderedPackage_ComponentElement_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addOrderedPackageComponentElementSubRequest(ComponentElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedPackage_ComponentElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedPackageItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "OrderedPackage_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedPackageItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedPackage_Item_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedPackageOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedPackage_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedPackageOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedPackage_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addOrderedPackageOrderedComponentSubRequest(OrderedComponentRequest subRequest) {
      addSubRequest(subRequest, "OrderedPackage_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addOrderedPackageOrderedComponentSubRequest(OrderedComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedPackage_OrderedComponent_Ref");
    }

/**
 *
 * Constructor for OrderedPackageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedPackageSubRequestParent(String id, String method) {
    super(id, "OrderedPackage", method);
  }
}
