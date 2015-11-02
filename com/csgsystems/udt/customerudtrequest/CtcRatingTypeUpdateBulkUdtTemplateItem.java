/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingTypeObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcRatingTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingTypeObjectData UpdateInIn) {
    super(id, context, "CtcRatingTypeUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(UpdateIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }


/**
 *
 * Sets the CtcRatingType
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcRatingType(CtcRatingTypeObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcRatingTypeObjectHelper.fromMap(inputMap, "CtcRatingType");
  }

/**
 *
 * Gets the CtcRatingType
 * @return Value of the CtcRatingType
 *
 */

  public CtcRatingTypeObjectData getCtcRatingType( ) {
    return UpdateIn;
  }

}
