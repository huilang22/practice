/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimStockPropConfigGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimStockPropConfigGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimStockPropConfigObjectKeyData InvsSimStockPropConfigGetIn;
/**
 *
 * Constructor to create a  InvsSimStockPropConfigGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimStockPropConfigGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimStockPropConfigObjectKeyData InvsSimStockPropConfigGetInIn) {
    super(id, context, "InvsSimStockPropConfigGet");
    InvsSimStockPropConfigGetIn = InvsSimStockPropConfigGetInIn;
  }

  public void translateToMap() {
    if (InvsSimStockPropConfigGetIn != null) {
      InvsSimStockPropConfigGetIn.resetFlags(true, true);
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectKeyHelper.toMap(InvsSimStockPropConfigGetIn, new HashMap(), "InvsSimStockPropConfigObjectKeyData").get("InvsSimStockPropConfigObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSimStockPropConfig
 * @param InvsSimStockPropConfigGetInIn Value of the InvsSimStockPropConfigGetIn
 *
 */

  public void setInvsSimStockPropConfig(InvsSimStockPropConfigObjectKeyData InvsSimStockPropConfigGetInIn) {
    InvsSimStockPropConfigGetIn = InvsSimStockPropConfigGetInIn;
  }

  public void translateFromMap() {
    InvsSimStockPropConfigGetIn = InvsSimStockPropConfigObjectKeyHelper.fromMap(inputMap, "InvsSimStockPropConfig");
  }

/**
 *
 * Gets the InvsSimStockPropConfig
 * @return Value of the InvsSimStockPropConfig
 *
 */

  public InvsSimStockPropConfigObjectKeyData getInvsSimStockPropConfig( ) {
    return InvsSimStockPropConfigGetIn;
  }

}
