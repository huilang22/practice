/*
 * Generated code DO NOT EDIT
 * Generated file: TaxAssignmentGetBulkUdtTemplateItem.java
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
 * Class used to create a TaxAssignmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxAssignmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxAssignmentObjectKeyData TAgetIn;
/**
 *
 * Constructor to create a  TaxAssignmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxAssignmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxAssignmentObjectKeyData TAgetInIn) {
    super(id, context, "TaxAssignmentGet");
    TAgetIn = TAgetInIn;
  }

  public void translateToMap() {
    if (TAgetIn != null) {
      TAgetIn.resetFlags(true, true);
      addInput("TaxAssignment", TaxAssignmentObjectKeyHelper.toMap(TAgetIn, new HashMap(), "TaxAssignmentObjectKeyData").get("TaxAssignmentObjectKeyData"));
    }
  }


/**
 *
 * Sets the TaxAssignment
 * @param TAgetInIn Value of the TAgetIn
 *
 */

  public void setTaxAssignment(TaxAssignmentObjectKeyData TAgetInIn) {
    TAgetIn = TAgetInIn;
  }

  public void translateFromMap() {
    TAgetIn = TaxAssignmentObjectKeyHelper.fromMap(inputMap, "TaxAssignment");
  }

/**
 *
 * Gets the TaxAssignment
 * @return Value of the TaxAssignment
 *
 */

  public TaxAssignmentObjectKeyData getTaxAssignment( ) {
    return TAgetIn;
  }

}
