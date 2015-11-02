/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionFindBulkUdtTemplateItem.java
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
 * Class used to create a CitAutoNoteActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CitAutoNoteActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitAutoNoteActionObjectFilter citAutoNoteActionFindIn;
/**
 *
 * Constructor to create a  CitAutoNoteActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitAutoNoteActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CitAutoNoteActionObjectFilter citAutoNoteActionFindInIn) {
    super(id, context, "CitAutoNoteActionFind");
    citAutoNoteActionFindIn = citAutoNoteActionFindInIn;
  }

  public void translateToMap() {
    if (citAutoNoteActionFindIn != null) {
      Integer index =  citAutoNoteActionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(citAutoNoteActionFindIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }


/**
 *
 * Sets the CitAutoNoteAction
 * @param citAutoNoteActionFindInIn Value of the citAutoNoteActionFindIn
 *
 */

  public void setCitAutoNoteAction(CitAutoNoteActionObjectFilter citAutoNoteActionFindInIn) {
    citAutoNoteActionFindIn = citAutoNoteActionFindInIn;
  }

  public void translateFromMap() {
    citAutoNoteActionFindIn = CitAutoNoteActionObjectHelper.fromMapFilter(inputMap, "CitAutoNoteAction");
  }

/**
 *
 * Gets the CitAutoNoteAction
 * @return Value of the CitAutoNoteAction
 *
 */

  public CitAutoNoteActionObjectFilter getCitAutoNoteAction( ) {
    return citAutoNoteActionFindIn;
  }

}
