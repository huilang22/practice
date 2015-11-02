/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a NoteReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteReasonObjectData NoteReasonCreateIn;
/**
 *
 * Constructor to create a  NoteReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteReasonObjectData NoteReasonCreateInIn) {
    super(id, context, "NoteReasonCreate");
    NoteReasonCreateIn = NoteReasonCreateInIn;
  }

  public void translateToMap() {
    if (NoteReasonCreateIn != null) {
      NoteReasonCreateIn.resetFlags(true, true);
      addInput("NoteReason", NoteReasonObjectHelper.toMap(NoteReasonCreateIn, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }


/**
 *
 * Sets the NoteReason
 * @param NoteReasonCreateInIn Value of the NoteReasonCreateIn
 *
 */

  public void setNoteReason(NoteReasonObjectData NoteReasonCreateInIn) {
    NoteReasonCreateIn = NoteReasonCreateInIn;
  }

  public void translateFromMap() {
    NoteReasonCreateIn = NoteReasonObjectHelper.fromMap(inputMap, "NoteReason");
  }

/**
 *
 * Gets the NoteReason
 * @return Value of the NoteReason
 *
 */

  public NoteReasonObjectData getNoteReason( ) {
    return NoteReasonCreateIn;
  }

}
