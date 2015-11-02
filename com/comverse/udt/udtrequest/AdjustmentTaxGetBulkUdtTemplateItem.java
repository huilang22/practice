/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTaxGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a AdjustmentTaxGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTaxGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentTaxObjectKeyData ATGetIn;
/**
 *
 * Constructor to create a  AdjustmentTaxGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTaxGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTaxObjectKeyData ATGetInIn) {
    super(id, context, "AdjustmentTaxGet");
    ATGetIn = ATGetInIn;
  }

  public void translateToMap() {
    if (ATGetIn != null) {
      ATGetIn.resetFlags(true, true);
      addInput("AdjustmentTax", AdjustmentTaxObjectKeyHelper.toMap(ATGetIn, new HashMap(), "AdjustmentTaxObjectKeyData").get("AdjustmentTaxObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdjustmentTax
 * @param ATGetInIn Value of the ATGetIn
 *
 */

  public void setAdjustmentTax(AdjustmentTaxObjectKeyData ATGetInIn) {
    ATGetIn = ATGetInIn;
  }

  public void translateFromMap() {
    ATGetIn = AdjustmentTaxObjectKeyHelper.fromMap(inputMap, "AdjustmentTax");
  }

/**
 *
 * Gets the AdjustmentTax
 * @return Value of the AdjustmentTax
 *
 */

  public AdjustmentTaxObjectKeyData getAdjustmentTax( ) {
    return ATGetIn;
  }

}
