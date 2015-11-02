/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a NoteFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteObjectFilter NoteFindIn;
/**
 *
 * Constructor to create a  NoteFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteObjectFilter NoteFindInIn) {
    super(id, context, "NoteFind");
    NoteFindIn = NoteFindInIn;
  }

  public void translateToMap() {
    if (NoteFindIn != null) {
      Integer index =  NoteFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Note", NoteObjectHelper.toMap(NoteFindIn, new HashMap(), "Note").get("Note"));
    }
  }


/**
 *
 * Sets the Note
 * @param NoteFindInIn Value of the NoteFindIn
 *
 */

  public void setNote(NoteObjectFilter NoteFindInIn) {
    NoteFindIn = NoteFindInIn;
  }

  public void translateFromMap() {
    NoteFindIn = NoteObjectHelper.fromMapFilter(inputMap, "Note");
  }

/**
 *
 * Gets the Note
 * @return Value of the Note
 *
 */

  public NoteObjectFilter getNote( ) {
    return NoteFindIn;
  }

}
