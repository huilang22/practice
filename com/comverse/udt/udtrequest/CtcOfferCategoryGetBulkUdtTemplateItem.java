/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferCategoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferCategoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferCategoryObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcOfferCategoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferCategoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferCategoryObjectKeyData GetInIn) {
    super(id, context, "CtcOfferCategoryGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcOfferCategory", CtcOfferCategoryObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferCategoryObjectKeyData").get("CtcOfferCategoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferCategory
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcOfferCategory(CtcOfferCategoryObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcOfferCategoryObjectKeyHelper.fromMap(inputMap, "CtcOfferCategory");
  }

/**
 *
 * Gets the CtcOfferCategory
 * @return Value of the CtcOfferCategory
 *
 */

  public CtcOfferCategoryObjectKeyData getCtcOfferCategory( ) {
    return GetIn;
  }

}
