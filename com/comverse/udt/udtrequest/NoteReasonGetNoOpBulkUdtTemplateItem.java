/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteReasonGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteReasonGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   NoteReasonGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteReasonGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteReasonObjectData noOpInIn) {
    super(id, context, "NoteReasonGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NoteReason", NoteReasonObjectHelper.toMap(noOpIn, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }
/**
 *
 * Sets the  NoteReason
 * @param noOpInIn NoteReasonObjectData to set
 *
 */
  public void setNoteReason(NoteReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteReason passed into the constructor
 * @return Simulated response
 *
 */
  public NoteReasonObjectData getNoteReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteReasonObjectHelper.fromMap(inputMap, "NoteReason");
  }
}
