/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a NoteReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteReasonObjectData NoteReasonUpdateIn;
/**
 *
 * Constructor to create a  NoteReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteReasonObjectData NoteReasonUpdateInIn) {
    super(id, context, "NoteReasonUpdate");
    NoteReasonUpdateIn = NoteReasonUpdateInIn;
  }

  public void translateToMap() {
    if (NoteReasonUpdateIn != null) {
      NoteReasonUpdateIn.resetFlags(true, true);
      addInput("NoteReason", NoteReasonObjectHelper.toMap(NoteReasonUpdateIn, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }


/**
 *
 * Sets the NoteReason
 * @param NoteReasonUpdateInIn Value of the NoteReasonUpdateIn
 *
 */

  public void setNoteReason(NoteReasonObjectData NoteReasonUpdateInIn) {
    NoteReasonUpdateIn = NoteReasonUpdateInIn;
  }

  public void translateFromMap() {
    NoteReasonUpdateIn = NoteReasonObjectHelper.fromMap(inputMap, "NoteReason");
  }

/**
 *
 * Gets the NoteReason
 * @return Value of the NoteReason
 *
 */

  public NoteReasonObjectData getNoteReason( ) {
    return NoteReasonUpdateIn;
  }

}
