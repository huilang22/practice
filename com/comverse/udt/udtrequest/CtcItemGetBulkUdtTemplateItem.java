/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcItemGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemObjectKeyData GetInIn) {
    super(id, context, "CtcItemGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcItem", CtcItemObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemObjectKeyData").get("CtcItemObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItem
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcItem(CtcItemObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcItemObjectKeyHelper.fromMap(inputMap, "CtcItem");
  }

/**
 *
 * Gets the CtcItem
 * @return Value of the CtcItem
 *
 */

  public CtcItemObjectKeyData getCtcItem( ) {
    return GetIn;
  }

}
