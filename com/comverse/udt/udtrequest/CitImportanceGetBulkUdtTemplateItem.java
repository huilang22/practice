/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a CitImportanceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CitImportanceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitImportanceObjectKeyData citImportanceGetIn;
/**
 *
 * Constructor to create a  CitImportanceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitImportanceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CitImportanceObjectKeyData citImportanceGetInIn) {
    super(id, context, "CitImportanceGet");
    citImportanceGetIn = citImportanceGetInIn;
  }

  public void translateToMap() {
    if (citImportanceGetIn != null) {
      citImportanceGetIn.resetFlags(true, true);
      addInput("CitImportance", CitImportanceObjectKeyHelper.toMap(citImportanceGetIn, new HashMap(), "CitImportanceObjectKeyData").get("CitImportanceObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitImportance
 * @param citImportanceGetInIn Value of the citImportanceGetIn
 *
 */

  public void setCitImportance(CitImportanceObjectKeyData citImportanceGetInIn) {
    citImportanceGetIn = citImportanceGetInIn;
  }

  public void translateFromMap() {
    citImportanceGetIn = CitImportanceObjectKeyHelper.fromMap(inputMap, "CitImportance");
  }

/**
 *
 * Gets the CitImportance
 * @return Value of the CitImportance
 *
 */

  public CitImportanceObjectKeyData getCitImportance( ) {
    return citImportanceGetIn;
  }

}
