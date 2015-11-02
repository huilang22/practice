/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementSubRequestParent.java
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
 * Abstract base class for all ComponentElement related UdtSubRequestParents
 *
 */
public abstract class ComponentElementSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  ComponentSubRequestParent as an InputRequest
 * @param inputRequest ComponentSubRequestParent to add as InputRequest
 *
 */
    public void addComponentComponentElementInputRequest(ComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Component_ComponentElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractComponentElementInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_ComponentElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedComponentSubRequestParent as an InputRequest
 * @param inputRequest OrderedComponentSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedComponentComponentElementInputRequest(OrderedComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedComponent_ComponentElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractComponentElementInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_ComponentElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedPackageSubRequestParent as an InputRequest
 * @param inputRequest OrderedPackageSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedPackageComponentElementInputRequest(OrderedPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedPackage_ComponentElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductComponentElementInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_ComponentElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductComponentElementInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_ComponentElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductPackageSubRequestParent as an InputRequest
 * @param inputRequest ProductPackageSubRequestParent to add as InputRequest
 *
 */
    public void addProductPackageComponentElementInputRequest(ProductPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ProductPackage_ComponentElement_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ComponentElementRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ComponentElementRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ComponentElementSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ComponentElementSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addComponentElementComponentSubRequest(ComponentRequest subRequest) {
      addSubRequest(subRequest, "ComponentElement_Component_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addComponentElementComponentSubRequest(ComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "ComponentElement_Component_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addComponentElementCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "ComponentElement_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addComponentElementCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "ComponentElement_CustomerContract_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addComponentElementOrderedComponentSubRequest(OrderedComponentRequest subRequest) {
      addSubRequest(subRequest, "ComponentElement_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addComponentElementOrderedComponentSubRequest(OrderedComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "ComponentElement_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addComponentElementOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "ComponentElement_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addComponentElementOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "ComponentElement_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addComponentElementOrderedPackageSubRequest(OrderedPackageRequest subRequest) {
      addSubRequest(subRequest, "ComponentElement_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addComponentElementOrderedPackageSubRequest(OrderedPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "ComponentElement_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addComponentElementOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "ComponentElement_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addComponentElementOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "ComponentElement_OrderedProduct_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addComponentElementProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "ComponentElement_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addComponentElementProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "ComponentElement_Product_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addComponentElementProductPackageSubRequest(ProductPackageRequest subRequest) {
      addSubRequest(subRequest, "ComponentElement_ProductPackage_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addComponentElementProductPackageSubRequest(ProductPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "ComponentElement_ProductPackage_Ref");
    }

/**
 *
 * Constructor for ComponentElementSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ComponentElementSubRequestParent(String id, String method) {
    super(id, "ComponentElement", method);
  }
}
