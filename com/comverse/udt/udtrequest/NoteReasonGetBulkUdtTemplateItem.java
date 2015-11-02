/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a NoteReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteReasonObjectKeyData NoteReasonGetIn;
/**
 *
 * Constructor to create a  NoteReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteReasonObjectKeyData NoteReasonGetInIn) {
    super(id, context, "NoteReasonGet");
    NoteReasonGetIn = NoteReasonGetInIn;
  }

  public void translateToMap() {
    if (NoteReasonGetIn != null) {
      NoteReasonGetIn.resetFlags(true, true);
      addInput("NoteReason", NoteReasonObjectKeyHelper.toMap(NoteReasonGetIn, new HashMap(), "NoteReasonObjectKeyData").get("NoteReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteReason
 * @param NoteReasonGetInIn Value of the NoteReasonGetIn
 *
 */

  public void setNoteReason(NoteReasonObjectKeyData NoteReasonGetInIn) {
    NoteReasonGetIn = NoteReasonGetInIn;
  }

  public void translateFromMap() {
    NoteReasonGetIn = NoteReasonObjectKeyHelper.fromMap(inputMap, "NoteReason");
  }

/**
 *
 * Gets the NoteReason
 * @return Value of the NoteReason
 *
 */

  public NoteReasonObjectKeyData getNoteReason( ) {
    return NoteReasonGetIn;
  }

}
