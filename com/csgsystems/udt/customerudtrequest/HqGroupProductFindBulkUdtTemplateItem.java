/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupProductFindBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupProductFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupProductFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupProductObjectFilter HQGPfindIn;
/**
 *
 * Constructor to create a  HqGroupProductFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupProductFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupProductObjectFilter HQGPfindInIn) {
    super(id, context, "HqGroupProductFind");
    HQGPfindIn = HQGPfindInIn;
  }

  public void translateToMap() {
    if (HQGPfindIn != null) {
      Integer index =  HQGPfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPfindIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }


/**
 *
 * Sets the HqGroupProduct
 * @param HQGPfindInIn Value of the HQGPfindIn
 *
 */

  public void setHqGroupProduct(HqGroupProductObjectFilter HQGPfindInIn) {
    HQGPfindIn = HQGPfindInIn;
  }

  public void translateFromMap() {
    HQGPfindIn = HqGroupProductObjectHelper.fromMapFilter(inputMap, "HqGroupProduct");
  }

/**
 *
 * Gets the HqGroupProduct
 * @return Value of the HqGroupProduct
 *
 */

  public HqGroupProductObjectFilter getHqGroupProduct( ) {
    return HQGPfindIn;
  }

}
