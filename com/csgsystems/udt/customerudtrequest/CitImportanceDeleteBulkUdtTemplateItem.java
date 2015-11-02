/*
 * Generated code DO NOT EDIT
 * Generated file: CitImportanceDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * Class used to create a CitImportanceDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CitImportanceDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitImportanceObjectKeyData citImportanceDeleteIn;
/**
 *
 * Constructor to create a  CitImportanceDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitImportanceDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CitImportanceObjectKeyData citImportanceDeleteInIn) {
    super(id, context, "CitImportanceDelete");
    citImportanceDeleteIn = citImportanceDeleteInIn;
  }

  public void translateToMap() {
    if (citImportanceDeleteIn != null) {
      citImportanceDeleteIn.resetFlags(true, true);
      addInput("CitImportance", CitImportanceObjectKeyHelper.toMap(citImportanceDeleteIn, new HashMap(), "CitImportanceObjectKeyData").get("CitImportanceObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitImportance
 * @param citImportanceDeleteInIn Value of the citImportanceDeleteIn
 *
 */

  public void setCitImportance(CitImportanceObjectKeyData citImportanceDeleteInIn) {
    citImportanceDeleteIn = citImportanceDeleteInIn;
  }

  public void translateFromMap() {
    citImportanceDeleteIn = CitImportanceObjectKeyHelper.fromMap(inputMap, "CitImportance");
  }

/**
 *
 * Gets the CitImportance
 * @return Value of the CitImportance
 *
 */

  public CitImportanceObjectKeyData getCitImportance( ) {
    return citImportanceDeleteIn;
  }

}
