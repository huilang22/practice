/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemExtendedDataUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemExtendedDataUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemExtendedDataObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcItemExtendedDataUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemExtendedDataUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemExtendedDataObjectData UpdateInIn) {
    super(id, context, "CtcItemExtendedDataUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(UpdateIn, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }


/**
 *
 * Sets the CtcItemExtendedData
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcItemExtendedData(CtcItemExtendedDataObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcItemExtendedDataObjectHelper.fromMap(inputMap, "CtcItemExtendedData");
  }

/**
 *
 * Gets the CtcItemExtendedData
 * @return Value of the CtcItemExtendedData
 *
 */

  public CtcItemExtendedDataObjectData getCtcItemExtendedData( ) {
    return UpdateIn;
  }

}
