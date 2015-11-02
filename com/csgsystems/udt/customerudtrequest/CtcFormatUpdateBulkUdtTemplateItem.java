/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcFormatUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcFormatUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatObjectData UpdateInIn) {
    super(id, context, "CtcFormatUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(UpdateIn, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }


/**
 *
 * Sets the CtcFormat
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcFormat(CtcFormatObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcFormatObjectHelper.fromMap(inputMap, "CtcFormat");
  }

/**
 *
 * Gets the CtcFormat
 * @return Value of the CtcFormat
 *
 */

  public CtcFormatObjectData getCtcFormat( ) {
    return UpdateIn;
  }

}
