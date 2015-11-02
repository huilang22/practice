/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BillModeOverrideDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillModeOverrideDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BMOObjectKeyData BMODeleteIn;
/**
 *
 * Constructor to create a  BillModeOverrideDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillModeOverrideDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BMOObjectKeyData BMODeleteInIn) {
    super(id, context, "BillModeOverrideDelete");
    BMODeleteIn = BMODeleteInIn;
  }

  public void translateToMap() {
    if (BMODeleteIn != null) {
      BMODeleteIn.resetFlags(true, true);
      addInput("BillModeOverride", BMOObjectKeyHelper.toMap(BMODeleteIn, new HashMap(), "BMOObjectKeyData").get("BMOObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillModeOverride
 * @param BMODeleteInIn Value of the BMODeleteIn
 *
 */

  public void setBillModeOverride(BMOObjectKeyData BMODeleteInIn) {
    BMODeleteIn = BMODeleteInIn;
  }

  public void translateFromMap() {
    BMODeleteIn = BMOObjectKeyHelper.fromMap(inputMap, "BillModeOverride");
  }

/**
 *
 * Gets the BillModeOverride
 * @return Value of the BillModeOverride
 *
 */

  public BMOObjectKeyData getBillModeOverride( ) {
    return BMODeleteIn;
  }

}
