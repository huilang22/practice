/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageSubRequestParent.java
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
 * Abstract base class for all ProductPackage related UdtSubRequestParents
 *
 */
public abstract class ProductPackageSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountProductPackageInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_ProductPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentSubRequestParent as an InputRequest
 * @param inputRequest ComponentSubRequestParent to add as InputRequest
 *
 */
    public void addComponentProductPackageInputRequest(ComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Component_ProductPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentElementSubRequestParent as an InputRequest
 * @param inputRequest ComponentElementSubRequestParent to add as InputRequest
 *
 */
    public void addComponentElementProductPackageInputRequest(ComponentElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ComponentElement_ProductPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemProductPackageInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_ProductPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountProductPackageInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_ProductPackage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedComponentSubRequestParent as an InputRequest
 * @param inputRequest OrderedComponentSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedComponentProductPackageInputRequest(OrderedComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedComponent_ProductPackage_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ProductPackageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductPackageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductPackageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductPackageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addProductPackageAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "ProductPackage_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addProductPackageAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductPackage_Account_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addProductPackageComponentSubRequest(ComponentRequest subRequest) {
      addSubRequest(subRequest, "ProductPackage_Component_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addProductPackageComponentSubRequest(ComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductPackage_Component_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addProductPackageComponentElementSubRequest(ComponentElementRequest subRequest) {
      addSubRequest(subRequest, "ProductPackage_ComponentElement_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addProductPackageComponentElementSubRequest(ComponentElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductPackage_ComponentElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addProductPackageItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "ProductPackage_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addProductPackageItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductPackage_Item_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addProductPackageOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "ProductPackage_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addProductPackageOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductPackage_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addProductPackageOrderedComponentSubRequest(OrderedComponentRequest subRequest) {
      addSubRequest(subRequest, "ProductPackage_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addProductPackageOrderedComponentSubRequest(OrderedComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductPackage_OrderedComponent_Ref");
    }

/**
 *
 * Constructor for ProductPackageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductPackageSubRequestParent(String id, String method) {
    super(id, "ProductPackage", method);
  }
}
