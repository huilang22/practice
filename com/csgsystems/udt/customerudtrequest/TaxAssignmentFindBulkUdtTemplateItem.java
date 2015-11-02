/*
 * Generated code DO NOT EDIT
 * Generated file: TaxAssignmentFindBulkUdtTemplateItem.java
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
 * Class used to create a TaxAssignmentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxAssignmentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxAssignmentObjectFilter TAfindIn;
/**
 *
 * Constructor to create a  TaxAssignmentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxAssignmentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxAssignmentObjectFilter TAfindInIn) {
    super(id, context, "TaxAssignmentFind");
    TAfindIn = TAfindInIn;
  }

  public void translateToMap() {
    if (TAfindIn != null) {
      Integer index =  TAfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxAssignment", TaxAssignmentObjectHelper.toMap(TAfindIn, new HashMap(), "TaxAssignment").get("TaxAssignment"));
    }
  }


/**
 *
 * Sets the TaxAssignment
 * @param TAfindInIn Value of the TAfindIn
 *
 */

  public void setTaxAssignment(TaxAssignmentObjectFilter TAfindInIn) {
    TAfindIn = TAfindInIn;
  }

  public void translateFromMap() {
    TAfindIn = TaxAssignmentObjectHelper.fromMapFilter(inputMap, "TaxAssignment");
  }

/**
 *
 * Gets the TaxAssignment
 * @return Value of the TaxAssignment
 *
 */

  public TaxAssignmentObjectFilter getTaxAssignment( ) {
    return TAfindIn;
  }

}
