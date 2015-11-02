/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupProductCreateBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupProductCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupProductCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupProductObjectData HQGPcreateIn;
/**
 *
 * Constructor to create a  HqGroupProductCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupProductCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupProductObjectData HQGPcreateInIn) {
    super(id, context, "HqGroupProductCreate");
    HQGPcreateIn = HQGPcreateInIn;
  }

  public void translateToMap() {
    if (HQGPcreateIn != null) {
      HQGPcreateIn.resetFlags(true, true);
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPcreateIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }


/**
 *
 * Sets the HqGroupProduct
 * @param HQGPcreateInIn Value of the HQGPcreateIn
 *
 */

  public void setHqGroupProduct(HqGroupProductObjectData HQGPcreateInIn) {
    HQGPcreateIn = HQGPcreateInIn;
  }

  public void translateFromMap() {
    HQGPcreateIn = HqGroupProductObjectHelper.fromMap(inputMap, "HqGroupProduct");
  }

/**
 *
 * Gets the HqGroupProduct
 * @return Value of the HqGroupProduct
 *
 */

  public HqGroupProductObjectData getHqGroupProduct( ) {
    return HQGPcreateIn;
  }

}
