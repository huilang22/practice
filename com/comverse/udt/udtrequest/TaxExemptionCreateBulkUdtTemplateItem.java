/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionCreateBulkUdtTemplateItem.java
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
 * Class used to create a TaxExemptionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxExemptionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxExemptionObjectData TEcreateIn;
/**
 *
 * Constructor to create a  TaxExemptionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxExemptionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxExemptionObjectData TEcreateInIn) {
    super(id, context, "TaxExemptionCreate");
    TEcreateIn = TEcreateInIn;
  }

  public void translateToMap() {
    if (TEcreateIn != null) {
      TEcreateIn.resetFlags(true, true);
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(TEcreateIn, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }


/**
 *
 * Sets the TaxExemption
 * @param TEcreateInIn Value of the TEcreateIn
 *
 */

  public void setTaxExemption(TaxExemptionObjectData TEcreateInIn) {
    TEcreateIn = TEcreateInIn;
  }

  public void translateFromMap() {
    TEcreateIn = TaxExemptionObjectHelper.fromMap(inputMap, "TaxExemption");
  }

/**
 *
 * Gets the TaxExemption
 * @return Value of the TaxExemption
 *
 */

  public TaxExemptionObjectData getTaxExemption( ) {
    return TEcreateIn;
  }

}
