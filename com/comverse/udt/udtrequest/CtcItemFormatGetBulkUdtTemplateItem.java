/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemFormatGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemFormatGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemFormatObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcItemFormatGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemFormatGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemFormatObjectKeyData GetInIn) {
    super(id, context, "CtcItemFormatGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcItemFormat", CtcItemFormatObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemFormatObjectKeyData").get("CtcItemFormatObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemFormat
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcItemFormat(CtcItemFormatObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcItemFormatObjectKeyHelper.fromMap(inputMap, "CtcItemFormat");
  }

/**
 *
 * Gets the CtcItemFormat
 * @return Value of the CtcItemFormat
 *
 */

  public CtcItemFormatObjectKeyData getCtcItemFormat( ) {
    return GetIn;
  }

}
