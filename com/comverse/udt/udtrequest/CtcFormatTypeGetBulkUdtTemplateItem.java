/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcFormatTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatTypeObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcFormatTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatTypeObjectKeyData GetInIn) {
    super(id, context, "CtcFormatTypeGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcFormatType", CtcFormatTypeObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcFormatTypeObjectKeyData").get("CtcFormatTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcFormatType
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcFormatType(CtcFormatTypeObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcFormatTypeObjectKeyHelper.fromMap(inputMap, "CtcFormatType");
  }

/**
 *
 * Gets the CtcFormatType
 * @return Value of the CtcFormatType
 *
 */

  public CtcFormatTypeObjectKeyData getCtcFormatType( ) {
    return GetIn;
  }

}
