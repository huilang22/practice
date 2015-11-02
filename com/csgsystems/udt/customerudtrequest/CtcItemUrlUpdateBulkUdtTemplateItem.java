/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemUrlUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemUrlUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemUrlUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemUrlObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcItemUrlUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemUrlUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemUrlObjectData UpdateInIn) {
    super(id, context, "CtcItemUrlUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(UpdateIn, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }


/**
 *
 * Sets the CtcItemUrl
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcItemUrl(CtcItemUrlObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcItemUrlObjectHelper.fromMap(inputMap, "CtcItemUrl");
  }

/**
 *
 * Gets the CtcItemUrl
 * @return Value of the CtcItemUrl
 *
 */

  public CtcItemUrlObjectData getCtcItemUrl( ) {
    return UpdateIn;
  }

}
