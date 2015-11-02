/*
 * Generated code DO NOT EDIT
 * Generated file: CitAutoNoteActionCreateBulkUdtTemplateItem.java
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
 * Class used to create a CitAutoNoteActionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitAutoNoteActionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitAutoNoteActionObjectData citAutoNoteActionCreateIn;
/**
 *
 * Constructor to create a  CitAutoNoteActionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitAutoNoteActionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitAutoNoteActionObjectData citAutoNoteActionCreateInIn) {
    super(id, context, "CitAutoNoteActionCreate");
    citAutoNoteActionCreateIn = citAutoNoteActionCreateInIn;
  }

  public void translateToMap() {
    if (citAutoNoteActionCreateIn != null) {
      citAutoNoteActionCreateIn.resetFlags(true, true);
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(citAutoNoteActionCreateIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }


/**
 *
 * Sets the CitAutoNoteAction
 * @param citAutoNoteActionCreateInIn Value of the citAutoNoteActionCreateIn
 *
 */

  public void setCitAutoNoteAction(CitAutoNoteActionObjectData citAutoNoteActionCreateInIn) {
    citAutoNoteActionCreateIn = citAutoNoteActionCreateInIn;
  }

  public void translateFromMap() {
    citAutoNoteActionCreateIn = CitAutoNoteActionObjectHelper.fromMap(inputMap, "CitAutoNoteAction");
  }

/**
 *
 * Gets the CitAutoNoteAction
 * @return Value of the CitAutoNoteAction
 *
 */

  public CitAutoNoteActionObjectData getCitAutoNoteAction( ) {
    return citAutoNoteActionCreateIn;
  }

}
