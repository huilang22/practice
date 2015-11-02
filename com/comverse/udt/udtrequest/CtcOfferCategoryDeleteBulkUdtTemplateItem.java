/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryDeleteBulkUdtTemplateItem.java
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
