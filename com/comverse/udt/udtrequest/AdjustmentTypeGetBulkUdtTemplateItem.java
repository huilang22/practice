/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentTypeObjectKeyData atdGetIn;
/**
 *
 * Constructor to create a  AdjustmentTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeObjectKeyData atdGetInIn) {
    super(id, context, "AdjustmentTypeGet");
    atdGetIn = atdGetInIn;
  }

  public void translateToMap() {
    if (atdGetIn != null) {
      atdGetIn.resetFlags(true, true);
      addInput("AdjustmentType", AdjustmentTypeObjectKeyHelper.toMap(atdGetIn, new HashMap(), "AdjustmentTypeObjectKeyData").get("AdjustmentTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdjustmentType
 * @param atdGetInIn Value of the atdGetIn
 *
 */

  public void setAdjustmentType(AdjustmentTypeObjectKeyData atdGetInIn) {
    atdGetIn = atdGetInIn;
  }

  public void translateFromMap() {
    atdGetIn = AdjustmentTypeObjectKeyHelper.fromMap(inputMap, "AdjustmentType");
  }

/**
 *
 * Gets the AdjustmentType
 * @return Value of the AdjustmentType
 *
 */

  public AdjustmentTypeObjectKeyData getAdjustmentType( ) {
    return atdGetIn;
  }

}
