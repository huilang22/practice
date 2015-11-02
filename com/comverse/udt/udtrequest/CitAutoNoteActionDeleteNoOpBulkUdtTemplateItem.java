/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitAutoNoteActionDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitAutoNoteActionDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitAutoNoteActionObjectData noOpIn;

/**
 *
 * Constructor to create a   CitAutoNoteActionDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitAutoNoteActionDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitAutoNoteActionObjectData noOpInIn) {
    super(id, context, "CitAutoNoteActionDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(noOpIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }
/**
 *
 * Sets the  CitAutoNoteAction
 * @param noOpInIn CitAutoNoteActionObjectData to set
 *
 */
  public void setCitAutoNoteAction(CitAutoNoteActionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitAutoNoteAction passed into the constructor
 * @return Simulated response
 *
 */
  public CitAutoNoteActionObjectData getCitAutoNoteAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitAutoNoteActionObjectHelper.fromMap(inputMap, "CitAutoNoteAction");
  }
}
