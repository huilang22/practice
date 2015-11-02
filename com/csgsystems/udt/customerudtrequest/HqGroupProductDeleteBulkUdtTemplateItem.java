/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupProductDeleteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqGroupProductDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupProductDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupProductObjectData HQGPdeleteIn;
  protected Integer ProductViewId;
/**
 *
 * Constructor to create a  HqGroupProductDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupProductDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupProductObjectData HQGPdeleteInIn, Integer ProductViewIdIn) {
    super(id, context, "HqGroupProductDelete");
    HQGPdeleteIn = HQGPdeleteInIn;
    ProductViewId = ProductViewIdIn;
  }

  public void translateToMap() {
    if (HQGPdeleteIn != null) {
      HQGPdeleteIn.resetFlags(true, true);
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPdeleteIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
    if (ProductViewId != null) {
      addInput("ProductViewId", ProductViewId);
    }
  }


/**
 *
 * Sets the HqGroupProduct
 * @param HQGPdeleteInIn Value of the HQGPdeleteIn
 *
 */

  public void setHqGroupProduct(HqGroupProductObjectData HQGPdeleteInIn) {
    HQGPdeleteIn = HQGPdeleteInIn;
  }

/**
 *
 * Sets the ProductViewId
 * @param ProductViewIdIn Value of the ProductViewId
 *
 */

  public void setProductViewId(Integer ProductViewIdIn) {
    ProductViewId = ProductViewIdIn;
  }

  public void translateFromMap() {
    HQGPdeleteIn = HqGroupProductObjectHelper.fromMap(inputMap, "HqGroupProduct");
    ProductViewId = (Integer)inputMap.get("ProductViewId");
  }

/**
 *
 * Gets the HqGroupProduct
 * @return Value of the HqGroupProduct
 *
 */

  public HqGroupProductObjectData getHqGroupProduct( ) {
    return HQGPdeleteIn;
  }

/**
 *
 * Gets the ProductViewId
 * @return Value of the ProductViewId
 *
 */

  public Integer getProductViewId( ) {
    return ProductViewId;
  }

}
