/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferCategoryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferCategoryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferCategoryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferCategoryObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcOfferCategoryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferCategoryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferCategoryObjectKeyData DeleteInIn) {
    super(id, context, "CtcOfferCategoryDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcOfferCategory", CtcOfferCategoryObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferCategoryObjectKeyData").get("CtcOfferCategoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferCategory
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcOfferCategory(CtcOfferCategoryObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcOfferCategoryObjectKeyHelper.fromMap(inputMap, "CtcOfferCategory");
  }

/**
 *
 * Gets the CtcOfferCategory
 * @return Value of the CtcOfferCategory
 *
 */

  public CtcOfferCategoryObjectKeyData getCtcOfferCategory( ) {
    return DeleteIn;
  }

}
