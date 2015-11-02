/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a TaxStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TSObjectKeyData TSGetIn;
/**
 *
 * Constructor to create a  TaxStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TSObjectKeyData TSGetInIn) {
    super(id, context, "TaxStatusGet");
    TSGetIn = TSGetInIn;
  }

  public void translateToMap() {
    if (TSGetIn != null) {
      TSGetIn.resetFlags(true, true);
      addInput("TaxStatus", TSObjectKeyHelper.toMap(TSGetIn, new HashMap(), "TSObjectKeyData").get("TSObjectKeyData"));
    }
  }


/**
 *
 * Sets the TaxStatus
 * @param TSGetInIn Value of the TSGetIn
 *
 */

  public void setTaxStatus(TSObjectKeyData TSGetInIn) {
    TSGetIn = TSGetInIn;
  }

  public void translateFromMap() {
    TSGetIn = TSObjectKeyHelper.fromMap(inputMap, "TaxStatus");
  }

/**
 *
 * Gets the TaxStatus
 * @return Value of the TaxStatus
 *
 */

  public TSObjectKeyData getTaxStatus( ) {
    return TSGetIn;
  }

}
