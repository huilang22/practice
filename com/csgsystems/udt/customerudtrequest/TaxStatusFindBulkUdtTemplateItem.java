/*
 * Generated code DO NOT EDIT
 * Generated file: TaxStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a TaxStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TSObjectFilter TSFindIn;
/**
 *
 * Constructor to create a  TaxStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TSObjectFilter TSFindInIn) {
    super(id, context, "TaxStatusFind");
    TSFindIn = TSFindInIn;
  }

  public void translateToMap() {
    if (TSFindIn != null) {
      Integer index =  TSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxStatus", TSObjectHelper.toMap(TSFindIn, new HashMap(), "TaxStatus").get("TaxStatus"));
    }
  }


/**
 *
 * Sets the TaxStatus
 * @param TSFindInIn Value of the TSFindIn
 *
 */

  public void setTaxStatus(TSObjectFilter TSFindInIn) {
    TSFindIn = TSFindInIn;
  }

  public void translateFromMap() {
    TSFindIn = TSObjectHelper.fromMapFilter(inputMap, "TaxStatus");
  }

/**
 *
 * Gets the TaxStatus
 * @return Value of the TaxStatus
 *
 */

  public TSObjectFilter getTaxStatus( ) {
    return TSFindIn;
  }

}
