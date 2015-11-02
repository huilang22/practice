/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferCategoryUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcOfferCategoryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferCategoryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferCategoryObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcOfferCategoryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferCategoryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferCategoryObjectData UpdateInIn) {
    super(id, context, "CtcOfferCategoryUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }


/**
 *
 * Sets the CtcOfferCategory
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcOfferCategory(CtcOfferCategoryObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcOfferCategoryObjectHelper.fromMap(inputMap, "CtcOfferCategory");
  }

/**
 *
 * Gets the CtcOfferCategory
 * @return Value of the CtcOfferCategory
 *
 */

  public CtcOfferCategoryObjectData getCtcOfferCategory( ) {
    return UpdateIn;
  }

}
