/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimStockPropConfigUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimStockPropConfigUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimStockPropConfigObjectData InvsSimStockPropConfigUpdateIn;
/**
 *
 * Constructor to create a  InvsSimStockPropConfigUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimStockPropConfigUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimStockPropConfigObjectData InvsSimStockPropConfigUpdateInIn) {
    super(id, context, "InvsSimStockPropConfigUpdate");
    InvsSimStockPropConfigUpdateIn = InvsSimStockPropConfigUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSimStockPropConfigUpdateIn != null) {
      InvsSimStockPropConfigUpdateIn.resetFlags(true, true);
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(InvsSimStockPropConfigUpdateIn, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }


/**
 *
 * Sets the InvsSimStockPropConfig
 * @param InvsSimStockPropConfigUpdateInIn Value of the InvsSimStockPropConfigUpdateIn
 *
 */

  public void setInvsSimStockPropConfig(InvsSimStockPropConfigObjectData InvsSimStockPropConfigUpdateInIn) {
    InvsSimStockPropConfigUpdateIn = InvsSimStockPropConfigUpdateInIn;
  }

  public void translateFromMap() {
    InvsSimStockPropConfigUpdateIn = InvsSimStockPropConfigObjectHelper.fromMap(inputMap, "InvsSimStockPropConfig");
  }

/**
 *
 * Gets the InvsSimStockPropConfig
 * @return Value of the InvsSimStockPropConfig
 *
 */

  public InvsSimStockPropConfigObjectData getInvsSimStockPropConfig( ) {
    return InvsSimStockPropConfigUpdateIn;
  }

}
