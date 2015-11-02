/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonDeleteBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeReasonObjectKeyData NoteTypeReasonDeleteIn;
/**
 *
 * Constructor to create a  NoteTypeReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeReasonObjectKeyData NoteTypeReasonDeleteInIn) {
    super(id, context, "NoteTypeReasonDelete");
    NoteTypeReasonDeleteIn = NoteTypeReasonDeleteInIn;
  }

  public void translateToMap() {
    if (NoteTypeReasonDeleteIn != null) {
      NoteTypeReasonDeleteIn.resetFlags(true, true);
      addInput("NoteTypeReason", NoteTypeReasonObjectKeyHelper.toMap(NoteTypeReasonDeleteIn, new HashMap(), "NoteTypeReasonObjectKeyData").get("NoteTypeReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteTypeReason
 * @param NoteTypeReasonDeleteInIn Value of the NoteTypeReasonDeleteIn
 *
 */

  public void setNoteTypeReason(NoteTypeReasonObjectKeyData NoteTypeReasonDeleteInIn) {
    NoteTypeReasonDeleteIn = NoteTypeReasonDeleteInIn;
  }

  public void translateFromMap() {
    NoteTypeReasonDeleteIn = NoteTypeReasonObjectKeyHelper.fromMap(inputMap, "NoteTypeReason");
  }

/**
 *
 * Gets the NoteTypeReason
 * @return Value of the NoteTypeReason
 *
 */

  public NoteTypeReasonObjectKeyData getNoteTypeReason( ) {
    return NoteTypeReasonDeleteIn;
  }

}
