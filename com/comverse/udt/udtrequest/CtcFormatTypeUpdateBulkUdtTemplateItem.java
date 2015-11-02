/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcFormatTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatTypeObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcFormatTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatTypeObjectData UpdateInIn) {
    super(id, context, "CtcFormatTypeUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(UpdateIn, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }


/**
 *
 * Sets the CtcFormatType
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcFormatType(CtcFormatTypeObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcFormatTypeObjectHelper.fromMap(inputMap, "CtcFormatType");
  }

/**
 *
 * Gets the CtcFormatType
 * @return Value of the CtcFormatType
 *
 */

  public CtcFormatTypeObjectData getCtcFormatType( ) {
    return UpdateIn;
  }

}
