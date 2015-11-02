/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionGetBulkUdtTemplateItem.java
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
 * Class used to create a TaxExemptionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxExemptionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxExemptionObjectKeyData TEgetIn;
/**
 *
 * Constructor to create a  TaxExemptionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxExemptionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxExemptionObjectKeyData TEgetInIn) {
    super(id, context, "TaxExemptionGet");
    TEgetIn = TEgetInIn;
  }

  public void translateToMap() {
    if (TEgetIn != null) {
      TEgetIn.resetFlags(true, true);
      addInput("TaxExemption", TaxExemptionObjectKeyHelper.toMap(TEgetIn, new HashMap(), "TaxExemptionObjectKeyData").get("TaxExemptionObjectKeyData"));
    }
  }


/**
 *
 * Sets the TaxExemption
 * @param TEgetInIn Value of the TEgetIn
 *
 */

  public void setTaxExemption(TaxExemptionObjectKeyData TEgetInIn) {
    TEgetIn = TEgetInIn;
  }

  public void translateFromMap() {
    TEgetIn = TaxExemptionObjectKeyHelper.fromMap(inputMap, "TaxExemption");
  }

/**
 *
 * Gets the TaxExemption
 * @return Value of the TaxExemption
 *
 */

  public TaxExemptionObjectKeyData getTaxExemption( ) {
    return TEgetIn;
  }

}
