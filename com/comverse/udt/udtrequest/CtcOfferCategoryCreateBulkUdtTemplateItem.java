/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferCategoryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferCategoryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferCategoryObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcOfferCategoryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferCategoryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferCategoryObjectData CreateInIn) {
    super(id, context, "CtcOfferCategoryCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(CreateIn, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }


/**
 *
 * Sets the CtcOfferCategory
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcOfferCategory(CtcOfferCategoryObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcOfferCategoryObjectHelper.fromMap(inputMap, "CtcOfferCategory");
  }

/**
 *
 * Gets the CtcOfferCategory
 * @return Value of the CtcOfferCategory
 *
 */

  public CtcOfferCategoryObjectData getCtcOfferCategory( ) {
    return CreateIn;
  }

}
