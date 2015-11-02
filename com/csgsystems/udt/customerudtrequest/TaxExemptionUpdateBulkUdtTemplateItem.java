/*
 * Generated code DO NOT EDIT
 * Generated file: TaxExemptionUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a TaxExemptionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxExemptionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxExemptionObjectData TEupdateIn;
/**
 *
 * Constructor to create a  TaxExemptionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxExemptionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxExemptionObjectData TEupdateInIn) {
    super(id, context, "TaxExemptionUpdate");
    TEupdateIn = TEupdateInIn;
  }

  public void translateToMap() {
    if (TEupdateIn != null) {
      TEupdateIn.resetFlags(true, true);
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(TEupdateIn, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }


/**
 *
 * Sets the TaxExemption
 * @param TEupdateInIn Value of the TEupdateIn
 *
 */

  public void setTaxExemption(TaxExemptionObjectData TEupdateInIn) {
    TEupdateIn = TEupdateInIn;
  }

  public void translateFromMap() {
    TEupdateIn = TaxExemptionObjectHelper.fromMap(inputMap, "TaxExemption");
  }

/**
 *
 * Gets the TaxExemption
 * @return Value of the TaxExemption
 *
 */

  public TaxExemptionObjectData getTaxExemption( ) {
    return TEupdateIn;
  }

}
