/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a HqGroupProductGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupProductGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupProductObjectData HQGPgetIn;
/**
 *
 * Constructor to create a  HqGroupProductGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupProductGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupProductObjectData HQGPgetInIn) {
    super(id, context, "HqGroupProductGet");
    HQGPgetIn = HQGPgetInIn;
  }

  public void translateToMap() {
    if (HQGPgetIn != null) {
      HQGPgetIn.resetFlags(true, true);
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPgetIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }


/**
 *
 * Sets the HqGroupProduct
 * @param HQGPgetInIn Value of the HQGPgetIn
 *
 */

  public void setHqGroupProduct(HqGroupProductObjectData HQGPgetInIn) {
    HQGPgetIn = HQGPgetInIn;
  }

  public void translateFromMap() {
    HQGPgetIn = HqGroupProductObjectHelper.fromMap(inputMap, "HqGroupProduct");
  }

/**
 *
 * Gets the HqGroupProduct
 * @return Value of the HqGroupProduct
 *
 */

  public HqGroupProductObjectData getHqGroupProduct( ) {
    return HQGPgetIn;
  }

}
