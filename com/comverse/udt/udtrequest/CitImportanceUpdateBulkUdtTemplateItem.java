/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CitImportanceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitImportanceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitImportanceObjectData citImportanceUpdateIn;
/**
 *
 * Constructor to create a  CitImportanceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitImportanceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitImportanceObjectData citImportanceUpdateInIn) {
    super(id, context, "CitImportanceUpdate");
    citImportanceUpdateIn = citImportanceUpdateInIn;
  }

  public void translateToMap() {
    if (citImportanceUpdateIn != null) {
      citImportanceUpdateIn.resetFlags(true, true);
      addInput("CitImportance", CitImportanceObjectHelper.toMap(citImportanceUpdateIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }


/**
 *
 * Sets the CitImportance
 * @param citImportanceUpdateInIn Value of the citImportanceUpdateIn
 *
 */

  public void setCitImportance(CitImportanceObjectData citImportanceUpdateInIn) {
    citImportanceUpdateIn = citImportanceUpdateInIn;
  }

  public void translateFromMap() {
    citImportanceUpdateIn = CitImportanceObjectHelper.fromMap(inputMap, "CitImportance");
  }

/**
 *
 * Gets the CitImportance
 * @return Value of the CitImportance
 *
 */

  public CitImportanceObjectData getCitImportance( ) {
    return citImportanceUpdateIn;
  }

}
