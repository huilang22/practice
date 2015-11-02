/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropConfigGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsStockPropConfigGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStockPropConfigGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStockPropConfigObjectKeyData InvsStockPropConfigGetIn;
/**
 *
 * Constructor to create a  InvsStockPropConfigGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStockPropConfigGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropConfigObjectKeyData InvsStockPropConfigGetInIn) {
    super(id, context, "InvsStockPropConfigGet");
    InvsStockPropConfigGetIn = InvsStockPropConfigGetInIn;
  }

  public void translateToMap() {
    if (InvsStockPropConfigGetIn != null) {
      InvsStockPropConfigGetIn.resetFlags(true, true);
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectKeyHelper.toMap(InvsStockPropConfigGetIn, new HashMap(), "InvsStockPropConfigObjectKeyData").get("InvsStockPropConfigObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsStockPropConfig
 * @param InvsStockPropConfigGetInIn Value of the InvsStockPropConfigGetIn
 *
 */

  public void setInvsStockPropConfig(InvsStockPropConfigObjectKeyData InvsStockPropConfigGetInIn) {
    InvsStockPropConfigGetIn = InvsStockPropConfigGetInIn;
  }

  public void translateFromMap() {
    InvsStockPropConfigGetIn = InvsStockPropConfigObjectKeyHelper.fromMap(inputMap, "InvsStockPropConfig");
  }

/**
 *
 * Gets the InvsStockPropConfig
 * @return Value of the InvsStockPropConfig
 *
 */

  public InvsStockPropConfigObjectKeyData getInvsStockPropConfig( ) {
    return InvsStockPropConfigGetIn;
  }

}
