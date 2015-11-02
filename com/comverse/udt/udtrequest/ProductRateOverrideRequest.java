/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProductRateOverride related UdtRequests
 *
 */

public abstract class ProductRateOverrideRequest extends UdtRequest {

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
 * Constructor for ProductRateOverrideRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProductRateOverrideRequest(String id, String method) {
    super(id, "ProductRateOverride", method);
  }
}
