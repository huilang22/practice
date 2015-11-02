/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcFormatGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcFormatGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatObjectKeyData GetInIn) {
    super(id, context, "CtcFormatGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcFormat", CtcFormatObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcFormatObjectKeyData").get("CtcFormatObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcFormat
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcFormat(CtcFormatObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcFormatObjectKeyHelper.fromMap(inputMap, "CtcFormat");
  }

/**
 *
 * Gets the CtcFormat
 * @return Value of the CtcFormat
 *
 */

  public CtcFormatObjectKeyData getCtcFormat( ) {
    return GetIn;
  }

}
