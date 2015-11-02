/*
 * Generated code DO NOT EDIT
 * Generated file: CitReasonDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CitReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CitReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitReasonObjectKeyData citReasonDeleteIn;
/**
 *
 * Constructor to create a  CitReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CitReasonObjectKeyData citReasonDeleteInIn) {
    super(id, context, "CitReasonDelete");
    citReasonDeleteIn = citReasonDeleteInIn;
  }

  public void translateToMap() {
    if (citReasonDeleteIn != null) {
      citReasonDeleteIn.resetFlags(true, true);
      addInput("CitReason", CitReasonObjectKeyHelper.toMap(citReasonDeleteIn, new HashMap(), "CitReasonObjectKeyData").get("CitReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitReason
 * @param citReasonDeleteInIn Value of the citReasonDeleteIn
 *
 */

  public void setCitReason(CitReasonObjectKeyData citReasonDeleteInIn) {
    citReasonDeleteIn = citReasonDeleteInIn;
  }

  public void translateFromMap() {
    citReasonDeleteIn = CitReasonObjectKeyHelper.fromMap(inputMap, "CitReason");
  }

/**
 *
 * Gets the CitReason
 * @return Value of the CitReason
 *
 */

  public CitReasonObjectKeyData getCitReason( ) {
    return citReasonDeleteIn;
  }

}
