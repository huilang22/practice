/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteTypeReasonDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTypeReasonDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTypeReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   NoteTypeReasonDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTypeReasonDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeReasonObjectData noOpInIn) {
    super(id, context, "NoteTypeReasonDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(noOpIn, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }
/**
 *
 * Sets the  NoteTypeReason
 * @param noOpInIn NoteTypeReasonObjectData to set
 *
 */
  public void setNoteTypeReason(NoteTypeReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteTypeReason passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTypeReasonObjectData getNoteTypeReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteTypeReasonObjectHelper.fromMap(inputMap, "NoteTypeReason");
  }
}
