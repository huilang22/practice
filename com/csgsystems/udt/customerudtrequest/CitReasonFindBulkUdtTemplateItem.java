/*
 * Generated code DO NOT EDIT
 * Generated file: CitReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a CitReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CitReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitReasonObjectFilter citReasonFindIn;
/**
 *
 * Constructor to create a  CitReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CitReasonObjectFilter citReasonFindInIn) {
    super(id, context, "CitReasonFind");
    citReasonFindIn = citReasonFindInIn;
  }

  public void translateToMap() {
    if (citReasonFindIn != null) {
      Integer index =  citReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitReason", CitReasonObjectHelper.toMap(citReasonFindIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }


/**
 *
 * Sets the CitReason
 * @param citReasonFindInIn Value of the citReasonFindIn
 *
 */

  public void setCitReason(CitReasonObjectFilter citReasonFindInIn) {
    citReasonFindIn = citReasonFindInIn;
  }

  public void translateFromMap() {
    citReasonFindIn = CitReasonObjectHelper.fromMapFilter(inputMap, "CitReason");
  }

/**
 *
 * Gets the CitReason
 * @return Value of the CitReason
 *
 */

  public CitReasonObjectFilter getCitReason( ) {
    return citReasonFindIn;
  }

}
