/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeySubRequestParent.java
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
 * Abstract base class for all ProductRateKey related UdtSubRequestParents
 *
 */
public abstract class ProductRateKeySubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductProductRateKeyInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_ProductRateKey_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductProductRateKeyInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_ProductRateKey_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ProductRateKeyRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductRateKeyRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductRateKeySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductRateKeySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addProductRateKeyOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "ProductRateKey_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addProductRateKeyOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductRateKey_OrderedProduct_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addProductRateKeyProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "ProductRateKey_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addProductRateKeyProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "ProductRateKey_Product_Ref");
    }

/**
 *
 * Constructor for ProductRateKeySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductRateKeySubRequestParent(String id, String method) {
    super(id, "ProductRateKey", method);
  }
}
