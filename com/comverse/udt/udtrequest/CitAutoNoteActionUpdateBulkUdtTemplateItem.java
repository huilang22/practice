/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CitAutoNoteActionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitAutoNoteActionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitAutoNoteActionObjectData citAutoNoteActionUpdateIn;
/**
 *
 * Constructor to create a  CitAutoNoteActionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitAutoNoteActionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitAutoNoteActionObjectData citAutoNoteActionUpdateInIn) {
    super(id, context, "CitAutoNoteActionUpdate");
    citAutoNoteActionUpdateIn = citAutoNoteActionUpdateInIn;
  }

  public void translateToMap() {
    if (citAutoNoteActionUpdateIn != null) {
      citAutoNoteActionUpdateIn.resetFlags(true, true);
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(citAutoNoteActionUpdateIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }


/**
 *
 * Sets the CitAutoNoteAction
 * @param citAutoNoteActionUpdateInIn Value of the citAutoNoteActionUpdateIn
 *
 */

  public void setCitAutoNoteAction(CitAutoNoteActionObjectData citAutoNoteActionUpdateInIn) {
    citAutoNoteActionUpdateIn = citAutoNoteActionUpdateInIn;
  }

  public void translateFromMap() {
    citAutoNoteActionUpdateIn = CitAutoNoteActionObjectHelper.fromMap(inputMap, "CitAutoNoteAction");
  }

/**
 *
 * Gets the CitAutoNoteAction
 * @return Value of the CitAutoNoteAction
 *
 */

  public CitAutoNoteActionObjectData getCitAutoNoteAction( ) {
    return citAutoNoteActionUpdateIn;
  }

}
