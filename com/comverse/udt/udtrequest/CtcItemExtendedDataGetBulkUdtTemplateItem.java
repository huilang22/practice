/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemExtendedDataGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemExtendedDataGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemExtendedDataObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcItemExtendedDataGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemExtendedDataGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemExtendedDataObjectKeyData GetInIn) {
    super(id, context, "CtcItemExtendedDataGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemExtendedDataObjectKeyData").get("CtcItemExtendedDataObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemExtendedData
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcItemExtendedData(CtcItemExtendedDataObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcItemExtendedDataObjectKeyHelper.fromMap(inputMap, "CtcItemExtendedData");
  }

/**
 *
 * Gets the CtcItemExtendedData
 * @return Value of the CtcItemExtendedData
 *
 */

  public CtcItemExtendedDataObjectKeyData getCtcItemExtendedData( ) {
    return GetIn;
  }

}
