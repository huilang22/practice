/*
 * Generated code DO NOT EDIT
 * Generated file: CitReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CitReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitReasonObjectData citReasonUpdateIn;
/**
 *
 * Constructor to create a  CitReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitReasonObjectData citReasonUpdateInIn) {
    super(id, context, "CitReasonUpdate");
    citReasonUpdateIn = citReasonUpdateInIn;
  }

  public void translateToMap() {
    if (citReasonUpdateIn != null) {
      citReasonUpdateIn.resetFlags(true, true);
      addInput("CitReason", CitReasonObjectHelper.toMap(citReasonUpdateIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }


/**
 *
 * Sets the CitReason
 * @param citReasonUpdateInIn Value of the citReasonUpdateIn
 *
 */

  public void setCitReason(CitReasonObjectData citReasonUpdateInIn) {
    citReasonUpdateIn = citReasonUpdateInIn;
  }

  public void translateFromMap() {
    citReasonUpdateIn = CitReasonObjectHelper.fromMap(inputMap, "CitReason");
  }

/**
 *
 * Gets the CitReason
 * @return Value of the CitReason
 *
 */

  public CitReasonObjectData getCitReason( ) {
    return citReasonUpdateIn;
  }

}
