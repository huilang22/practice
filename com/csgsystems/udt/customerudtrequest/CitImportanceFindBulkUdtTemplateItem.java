/*
 * Generated code DO NOT EDIT
 * Generated file: CitImportanceFindBulkUdtTemplateItem.java
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
 * Class used to create a CitImportanceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CitImportanceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitImportanceObjectFilter citImportanceFindIn;
/**
 *
 * Constructor to create a  CitImportanceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitImportanceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CitImportanceObjectFilter citImportanceFindInIn) {
    super(id, context, "CitImportanceFind");
    citImportanceFindIn = citImportanceFindInIn;
  }

  public void translateToMap() {
    if (citImportanceFindIn != null) {
      Integer index =  citImportanceFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitImportance", CitImportanceObjectHelper.toMap(citImportanceFindIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }


/**
 *
 * Sets the CitImportance
 * @param citImportanceFindInIn Value of the citImportanceFindIn
 *
 */

  public void setCitImportance(CitImportanceObjectFilter citImportanceFindInIn) {
    citImportanceFindIn = citImportanceFindInIn;
  }

  public void translateFromMap() {
    citImportanceFindIn = CitImportanceObjectHelper.fromMapFilter(inputMap, "CitImportance");
  }

/**
 *
 * Gets the CitImportance
 * @return Value of the CitImportance
 *
 */

  public CitImportanceObjectFilter getCitImportance( ) {
    return citImportanceFindIn;
  }

}
