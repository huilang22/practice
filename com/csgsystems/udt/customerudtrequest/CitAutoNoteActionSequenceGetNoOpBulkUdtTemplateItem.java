/*
 * Generated code DO NOT EDIT
 * Generated file: CitAutoNoteActionSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitAutoNoteActionSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitAutoNoteActionSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitAutoNoteActionObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   CitAutoNoteActionSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitAutoNoteActionSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitAutoNoteActionObjectKeyData noOpInIn) {
    super(id, context, "CitAutoNoteActionSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }
/**
 *
 * Sets the  CitAutoNoteAction
 * @param noOpInIn CitAutoNoteActionObjectKeyData to set
 *
 */
  public void setCitAutoNoteAction(CitAutoNoteActionObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitAutoNoteAction passed into the constructor
 * @return Simulated response
 *
 */
  public CitAutoNoteActionObjectKeyData getCitAutoNoteAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitAutoNoteActionObjectKeyHelper.fromMap(inputMap, "CitAutoNoteAction");
  }
}
