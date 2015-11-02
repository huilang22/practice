/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceCreateBulkUdtTemplateItem.java
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
 * Class used to create a CitImportanceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitImportanceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitImportanceObjectData citImportanceCreateIn;
/**
 *
 * Constructor to create a  CitImportanceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitImportanceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitImportanceObjectData citImportanceCreateInIn) {
    super(id, context, "CitImportanceCreate");
    citImportanceCreateIn = citImportanceCreateInIn;
  }

  public void translateToMap() {
    if (citImportanceCreateIn != null) {
      citImportanceCreateIn.resetFlags(true, true);
      addInput("CitImportance", CitImportanceObjectHelper.toMap(citImportanceCreateIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }


/**
 *
 * Sets the CitImportance
 * @param citImportanceCreateInIn Value of the citImportanceCreateIn
 *
 */

  public void setCitImportance(CitImportanceObjectData citImportanceCreateInIn) {
    citImportanceCreateIn = citImportanceCreateInIn;
  }

  public void translateFromMap() {
    citImportanceCreateIn = CitImportanceObjectHelper.fromMap(inputMap, "CitImportance");
  }

/**
 *
 * Gets the CitImportance
 * @return Value of the CitImportance
 *
 */

  public CitImportanceObjectData getCitImportance( ) {
    return citImportanceCreateIn;
  }

}
