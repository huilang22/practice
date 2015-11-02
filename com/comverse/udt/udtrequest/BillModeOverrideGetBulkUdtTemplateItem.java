/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a BillModeOverrideGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillModeOverrideGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BMOObjectKeyData BMOGetIn;
/**
 *
 * Constructor to create a  BillModeOverrideGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillModeOverrideGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BMOObjectKeyData BMOGetInIn) {
    super(id, context, "BillModeOverrideGet");
    BMOGetIn = BMOGetInIn;
  }

  public void translateToMap() {
    if (BMOGetIn != null) {
      BMOGetIn.resetFlags(true, true);
      addInput("BillModeOverride", BMOObjectKeyHelper.toMap(BMOGetIn, new HashMap(), "BMOObjectKeyData").get("BMOObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillModeOverride
 * @param BMOGetInIn Value of the BMOGetIn
 *
 */

  public void setBillModeOverride(BMOObjectKeyData BMOGetInIn) {
    BMOGetIn = BMOGetInIn;
  }

  public void translateFromMap() {
    BMOGetIn = BMOObjectKeyHelper.fromMap(inputMap, "BillModeOverride");
  }

/**
 *
 * Gets the BillModeOverride
 * @return Value of the BillModeOverride
 *
 */

  public BMOObjectKeyData getBillModeOverride( ) {
    return BMOGetIn;
  }

}
