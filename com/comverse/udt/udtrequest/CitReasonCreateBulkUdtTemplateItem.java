/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a CitReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitReasonObjectData citReasonCreateIn;
/**
 *
 * Constructor to create a  CitReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitReasonObjectData citReasonCreateInIn) {
    super(id, context, "CitReasonCreate");
    citReasonCreateIn = citReasonCreateInIn;
  }

  public void translateToMap() {
    if (citReasonCreateIn != null) {
      citReasonCreateIn.resetFlags(true, true);
      addInput("CitReason", CitReasonObjectHelper.toMap(citReasonCreateIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }


/**
 *
 * Sets the CitReason
 * @param citReasonCreateInIn Value of the citReasonCreateIn
 *
 */

  public void setCitReason(CitReasonObjectData citReasonCreateInIn) {
    citReasonCreateIn = citReasonCreateInIn;
  }

  public void translateFromMap() {
    citReasonCreateIn = CitReasonObjectHelper.fromMap(inputMap, "CitReason");
  }

/**
 *
 * Gets the CitReason
 * @return Value of the CitReason
 *
 */

  public CitReasonObjectData getCitReason( ) {
    return citReasonCreateIn;
  }

}
