/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideSubRequestParent.java
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
 * Abstract base class for all ProductRateOverride related UdtSubRequestParents
 *
 */
public abstract class ProductRateOverrideSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductProductRateOverrideInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_ProductRateOverride_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductProductRateOverrideInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_ProductRateOverride_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ProductRateOverrideRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductRateOverrideRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductRateOverrideSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductRateOverrideSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addProductRateOverrideOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "ProductRateOverride_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addProductRateOverrideOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductRateOverride_OrderedProduct_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addProductRateOverrideProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "ProductRateOverride_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addProductRateOverrideProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductRateOverride_Product_Ref");
    }

/**
 *
 * Constructor for ProductRateOverrideSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductRateOverrideSubRequestParent(String id, String method) {
    super(id, "ProductRateOverride", method);
  }
}
