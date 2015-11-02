/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CitAutoNoteActionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CitAutoNoteActionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitAutoNoteActionObjectKeyData citAutoNoteActionDeleteIn;
/**
 *
 * Constructor to create a  CitAutoNoteActionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitAutoNoteActionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CitAutoNoteActionObjectKeyData citAutoNoteActionDeleteInIn) {
    super(id, context, "CitAutoNoteActionDelete");
    citAutoNoteActionDeleteIn = citAutoNoteActionDeleteInIn;
  }

  public void translateToMap() {
    if (citAutoNoteActionDeleteIn != null) {
      citAutoNoteActionDeleteIn.resetFlags(true, true);
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectKeyHelper.toMap(citAutoNoteActionDeleteIn, new HashMap(), "CitAutoNoteActionObjectKeyData").get("CitAutoNoteActionObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitAutoNoteAction
 * @param citAutoNoteActionDeleteInIn Value of the citAutoNoteActionDeleteIn
 *
 */

  public void setCitAutoNoteAction(CitAutoNoteActionObjectKeyData citAutoNoteActionDeleteInIn) {
    citAutoNoteActionDeleteIn = citAutoNoteActionDeleteInIn;
  }

  public void translateFromMap() {
    citAutoNoteActionDeleteIn = CitAutoNoteActionObjectKeyHelper.fromMap(inputMap, "CitAutoNoteAction");
  }

/**
 *
 * Gets the CitAutoNoteAction
 * @return Value of the CitAutoNoteAction
 *
 */

  public CitAutoNoteActionObjectKeyData getCitAutoNoteAction( ) {
    return citAutoNoteActionDeleteIn;
  }

}
