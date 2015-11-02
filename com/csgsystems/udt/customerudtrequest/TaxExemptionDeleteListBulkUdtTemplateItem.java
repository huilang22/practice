/*
 * Generated code DO NOT EDIT
 * Generated file: TaxExemptionDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a TaxExemptionDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxExemptionDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxExemptionObjectFilter TELdelIn;
  protected Date TELInactiveDate;
/**
 *
 * Constructor to create a  TaxExemptionDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxExemptionDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxExemptionObjectFilter TELdelInIn, Date TELInactiveDateIn) {
    super(id, context, "TaxExemptionDeleteList");
    TELdelIn = TELdelInIn;
    TELInactiveDate = TELInactiveDateIn;
  }

  public void translateToMap() {
    if (TELdelIn != null) {
      Integer index =  TELdelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(TELdelIn, new HashMap(), "Void").get("Void"));
    }
    if (TELInactiveDate != null) {
      addInput("InactiveDate", TELInactiveDate);
    }
  }


/**
 *
 * Sets the TaxExemption
 * @param TELdelInIn Value of the TELdelIn
 *
 */

  public void setTaxExemption(TaxExemptionObjectFilter TELdelInIn) {
    TELdelIn = TELdelInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param TELInactiveDateIn Value of the TELInactiveDate
 *
 */

  public void setInactiveDate(Date TELInactiveDateIn) {
    TELInactiveDate = TELInactiveDateIn;
  }

  public void translateFromMap() {
    TELdelIn = TaxExemptionObjectHelper.fromMapFilter(inputMap, "TaxExemption");
    TELInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the TaxExemption
 * @return Value of the TaxExemption
 *
 */

  public TaxExemptionObjectFilter getTaxExemption( ) {
    return TELdelIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return TELInactiveDate;
  }

}
