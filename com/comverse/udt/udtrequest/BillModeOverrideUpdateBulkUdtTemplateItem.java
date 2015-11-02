/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillModeOverrideUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillModeOverrideUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BMOObjectData BMOUpdateIn;
/**
 *
 * Constructor to create a  BillModeOverrideUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillModeOverrideUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BMOObjectData BMOUpdateInIn) {
    super(id, context, "BillModeOverrideUpdate");
    BMOUpdateIn = BMOUpdateInIn;
  }

  public void translateToMap() {
    if (BMOUpdateIn != null) {
      BMOUpdateIn.resetFlags(true, true);
      addInput("BillModeOverride", BMOObjectHelper.toMap(BMOUpdateIn, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }


/**
 *
 * Sets the BillModeOverride
 * @param BMOUpdateInIn Value of the BMOUpdateIn
 *
 */

  public void setBillModeOverride(BMOObjectData BMOUpdateInIn) {
    BMOUpdateIn = BMOUpdateInIn;
  }

  public void translateFromMap() {
    BMOUpdateIn = BMOObjectHelper.fromMap(inputMap, "BillModeOverride");
  }

/**
 *
 * Gets the BillModeOverride
 * @return Value of the BillModeOverride
 *
 */

  public BMOObjectData getBillModeOverride( ) {
    return BMOUpdateIn;
  }

}
