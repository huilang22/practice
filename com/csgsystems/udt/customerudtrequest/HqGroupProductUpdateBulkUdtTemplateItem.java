/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupProductUpdateBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupProductUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupProductUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupProductObjectData HQGPupdateIn;
/**
 *
 * Constructor to create a  HqGroupProductUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupProductUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupProductObjectData HQGPupdateInIn) {
    super(id, context, "HqGroupProductUpdate");
    HQGPupdateIn = HQGPupdateInIn;
  }

  public void translateToMap() {
    if (HQGPupdateIn != null) {
      HQGPupdateIn.resetFlags(true, true);
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPupdateIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }


/**
 *
 * Sets the HqGroupProduct
 * @param HQGPupdateInIn Value of the HQGPupdateIn
 *
 */

  public void setHqGroupProduct(HqGroupProductObjectData HQGPupdateInIn) {
    HQGPupdateIn = HQGPupdateInIn;
  }

  public void translateFromMap() {
    HQGPupdateIn = HqGroupProductObjectHelper.fromMap(inputMap, "HqGroupProduct");
  }

/**
 *
 * Gets the HqGroupProduct
 * @return Value of the HqGroupProduct
 *
 */

  public HqGroupProductObjectData getHqGroupProduct( ) {
    return HQGPupdateIn;
  }

}
