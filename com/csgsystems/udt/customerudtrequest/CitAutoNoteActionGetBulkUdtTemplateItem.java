/*
 * Generated code DO NOT EDIT
 * Generated file: CitAutoNoteActionGetBulkUdtTemplateItem.java
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
 * Class used to create a CitAutoNoteActionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CitAutoNoteActionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitAutoNoteActionObjectKeyData citAutoNoteActionGetIn;
/**
 *
 * Constructor to create a  CitAutoNoteActionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitAutoNoteActionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CitAutoNoteActionObjectKeyData citAutoNoteActionGetInIn) {
    super(id, context, "CitAutoNoteActionGet");
    citAutoNoteActionGetIn = citAutoNoteActionGetInIn;
  }

  public void translateToMap() {
    if (citAutoNoteActionGetIn != null) {
      citAutoNoteActionGetIn.resetFlags(true, true);
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectKeyHelper.toMap(citAutoNoteActionGetIn, new HashMap(), "CitAutoNoteActionObjectKeyData").get("CitAutoNoteActionObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitAutoNoteAction
 * @param citAutoNoteActionGetInIn Value of the citAutoNoteActionGetIn
 *
 */

  public void setCitAutoNoteAction(CitAutoNoteActionObjectKeyData citAutoNoteActionGetInIn) {
    citAutoNoteActionGetIn = citAutoNoteActionGetInIn;
  }

  public void translateFromMap() {
    citAutoNoteActionGetIn = CitAutoNoteActionObjectKeyHelper.fromMap(inputMap, "CitAutoNoteAction");
  }

/**
 *
 * Gets the CitAutoNoteAction
 * @return Value of the CitAutoNoteAction
 *
 */

  public CitAutoNoteActionObjectKeyData getCitAutoNoteAction( ) {
    return citAutoNoteActionGetIn;
  }

}
