/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeReasonObjectData NoteTypeReasonUpdateIn;
/**
 *
 * Constructor to create a  NoteTypeReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeReasonObjectData NoteTypeReasonUpdateInIn) {
    super(id, context, "NoteTypeReasonUpdate");
    NoteTypeReasonUpdateIn = NoteTypeReasonUpdateInIn;
  }

  public void translateToMap() {
    if (NoteTypeReasonUpdateIn != null) {
      NoteTypeReasonUpdateIn.resetFlags(true, true);
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(NoteTypeReasonUpdateIn, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }


/**
 *
 * Sets the NoteTypeReason
 * @param NoteTypeReasonUpdateInIn Value of the NoteTypeReasonUpdateIn
 *
 */

  public void setNoteTypeReason(NoteTypeReasonObjectData NoteTypeReasonUpdateInIn) {
    NoteTypeReasonUpdateIn = NoteTypeReasonUpdateInIn;
  }

  public void translateFromMap() {
    NoteTypeReasonUpdateIn = NoteTypeReasonObjectHelper.fromMap(inputMap, "NoteTypeReason");
  }

/**
 *
 * Gets the NoteTypeReason
 * @return Value of the NoteTypeReason
 *
 */

  public NoteTypeReasonObjectData getNoteTypeReason( ) {
    return NoteTypeReasonUpdateIn;
  }

}
