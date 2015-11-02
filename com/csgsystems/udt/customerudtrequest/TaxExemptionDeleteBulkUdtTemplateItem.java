/*
 * Generated code DO NOT EDIT
 * Generated file: TaxExemptionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a TaxExemptionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxExemptionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxExemptionObjectKeyData TEdelIn;
  protected Date TEInactiveDate;
/**
 *
 * Constructor to create a  TaxExemptionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxExemptionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxExemptionObjectKeyData TEdelInIn, Date TEInactiveDateIn) {
    super(id, context, "TaxExemptionDelete");
    TEdelIn = TEdelInIn;
    TEInactiveDate = TEInactiveDateIn;
  }

  public void translateToMap() {
    if (TEdelIn != null) {
      TEdelIn.resetFlags(true, true);
      addInput("TaxExemption", TaxExemptionObjectKeyHelper.toMap(TEdelIn, new HashMap(), "TaxExemptionObjectKeyData").get("TaxExemptionObjectKeyData"));
    }
    if (TEInactiveDate != null) {
      addInput("InactiveDate", TEInactiveDate);
    }
  }


/**
 *
 * Sets the TaxExemption
 * @param TEdelInIn Value of the TEdelIn
 *
 */

  public void setTaxExemption(TaxExemptionObjectKeyData TEdelInIn) {
    TEdelIn = TEdelInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param TEInactiveDateIn Value of the TEInactiveDate
 *
 */

  public void setInactiveDate(Date TEInactiveDateIn) {
    TEInactiveDate = TEInactiveDateIn;
  }

  public void translateFromMap() {
    TEdelIn = TaxExemptionObjectKeyHelper.fromMap(inputMap, "TaxExemption");
    TEInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the TaxExemption
 * @return Value of the TaxExemption
 *
 */

  public TaxExemptionObjectKeyData getTaxExemption( ) {
    return TEdelIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return TEInactiveDate;
  }

}
