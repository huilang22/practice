/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonDeleteBulkUdtTemplateItem.java
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
 * Class used to create a NoteReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteReasonObjectKeyData NoteReasonDeleteIn;
/**
 *
 * Constructor to create a  NoteReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteReasonObjectKeyData NoteReasonDeleteInIn) {
    super(id, context, "NoteReasonDelete");
    NoteReasonDeleteIn = NoteReasonDeleteInIn;
  }

  public void translateToMap() {
    if (NoteReasonDeleteIn != null) {
      NoteReasonDeleteIn.resetFlags(true, true);
      addInput("NoteReason", NoteReasonObjectKeyHelper.toMap(NoteReasonDeleteIn, new HashMap(), "NoteReasonObjectKeyData").get("NoteReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteReason
 * @param NoteReasonDeleteInIn Value of the NoteReasonDeleteIn
 *
 */

  public void setNoteReason(NoteReasonObjectKeyData NoteReasonDeleteInIn) {
    NoteReasonDeleteIn = NoteReasonDeleteInIn;
  }

  public void translateFromMap() {
    NoteReasonDeleteIn = NoteReasonObjectKeyHelper.fromMap(inputMap, "NoteReason");
  }

/**
 *
 * Gets the NoteReason
 * @return Value of the NoteReason
 *
 */

  public NoteReasonObjectKeyData getNoteReason( ) {
    return NoteReasonDeleteIn;
  }

}
