/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyGetBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsStockPropertyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStockPropertyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStockPropertyObjectKeyData InvsStockPropertyGetIn;
/**
 *
 * Constructor to create a  InvsStockPropertyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStockPropertyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropertyObjectKeyData InvsStockPropertyGetInIn) {
    super(id, context, "InvsStockPropertyGet");
    InvsStockPropertyGetIn = InvsStockPropertyGetInIn;
  }

  public void translateToMap() {
    if (InvsStockPropertyGetIn != null) {
      InvsStockPropertyGetIn.resetFlags(true, true);
      addInput("InvsStockProperty", InvsStockPropertyObjectKeyHelper.toMap(InvsStockPropertyGetIn, new HashMap(), "InvsStockPropertyObjectKeyData").get("InvsStockPropertyObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsStockProperty
 * @param InvsStockPropertyGetInIn Value of the InvsStockPropertyGetIn
 *
 */

  public void setInvsStockProperty(InvsStockPropertyObjectKeyData InvsStockPropertyGetInIn) {
    InvsStockPropertyGetIn = InvsStockPropertyGetInIn;
  }

  public void translateFromMap() {
    InvsStockPropertyGetIn = InvsStockPropertyObjectKeyHelper.fromMap(inputMap, "InvsStockProperty");
  }

/**
 *
 * Gets the InvsStockProperty
 * @return Value of the InvsStockProperty
 *
 */

  public InvsStockPropertyObjectKeyData getInvsStockProperty( ) {
    return InvsStockPropertyGetIn;
  }

}
