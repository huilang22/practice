/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupProductDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupProductDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupProductObjectFilter HQGPdeleteListIn;
/**
 *
 * Constructor to create a  HqGroupProductDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupProductDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupProductObjectFilter HQGPdeleteListInIn) {
    super(id, context, "HqGroupProductDeleteList");
    HQGPdeleteListIn = HQGPdeleteListInIn;
  }

  public void translateToMap() {
    if (HQGPdeleteListIn != null) {
      Integer index =  HQGPdeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPdeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the HqGroupProduct
 * @param HQGPdeleteListInIn Value of the HQGPdeleteListIn
 *
 */

  public void setHqGroupProduct(HqGroupProductObjectFilter HQGPdeleteListInIn) {
    HQGPdeleteListIn = HQGPdeleteListInIn;
  }

  public void translateFromMap() {
    HQGPdeleteListIn = HqGroupProductObjectHelper.fromMapFilter(inputMap, "HqGroupProduct");
  }

/**
 *
 * Gets the HqGroupProduct
 * @return Value of the HqGroupProduct
 *
 */

  public HqGroupProductObjectFilter getHqGroupProduct( ) {
    return HQGPdeleteListIn;
  }

}
