/*
 * Generated code DO NOT EDIT
 * Generated file: CitReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a CitReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CitReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitReasonObjectKeyData citReasonGetIn;
/**
 *
 * Constructor to create a  CitReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CitReasonObjectKeyData citReasonGetInIn) {
    super(id, context, "CitReasonGet");
    citReasonGetIn = citReasonGetInIn;
  }

  public void translateToMap() {
    if (citReasonGetIn != null) {
      citReasonGetIn.resetFlags(true, true);
      addInput("CitReason", CitReasonObjectKeyHelper.toMap(citReasonGetIn, new HashMap(), "CitReasonObjectKeyData").get("CitReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitReason
 * @param citReasonGetInIn Value of the citReasonGetIn
 *
 */

  public void setCitReason(CitReasonObjectKeyData citReasonGetInIn) {
    citReasonGetIn = citReasonGetInIn;
  }

  public void translateFromMap() {
    citReasonGetIn = CitReasonObjectKeyHelper.fromMap(inputMap, "CitReason");
  }

/**
 *
 * Gets the CitReason
 * @return Value of the CitReason
 *
 */

  public CitReasonObjectKeyData getCitReason( ) {
    return citReasonGetIn;
  }

}
