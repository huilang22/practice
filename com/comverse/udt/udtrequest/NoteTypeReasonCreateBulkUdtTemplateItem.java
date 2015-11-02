/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeReasonObjectData NoteTypeReasonCreateIn;
/**
 *
 * Constructor to create a  NoteTypeReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeReasonObjectData NoteTypeReasonCreateInIn) {
    super(id, context, "NoteTypeReasonCreate");
    NoteTypeReasonCreateIn = NoteTypeReasonCreateInIn;
  }

  public void translateToMap() {
    if (NoteTypeReasonCreateIn != null) {
      NoteTypeReasonCreateIn.resetFlags(true, true);
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(NoteTypeReasonCreateIn, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }


/**
 *
 * Sets the NoteTypeReason
 * @param NoteTypeReasonCreateInIn Value of the NoteTypeReasonCreateIn
 *
 */

  public void setNoteTypeReason(NoteTypeReasonObjectData NoteTypeReasonCreateInIn) {
    NoteTypeReasonCreateIn = NoteTypeReasonCreateInIn;
  }

  public void translateFromMap() {
    NoteTypeReasonCreateIn = NoteTypeReasonObjectHelper.fromMap(inputMap, "NoteTypeReason");
  }

/**
 *
 * Gets the NoteTypeReason
 * @return Value of the NoteTypeReason
 *
 */

  public NoteTypeReasonObjectData getNoteTypeReason( ) {
    return NoteTypeReasonCreateIn;
  }

}
