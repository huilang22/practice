/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTextGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteTextGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTextGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTextObjectData noOpIn;

/**
 *
 * Constructor to create a   NoteTextGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTextGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTextObjectData noOpInIn) {
    super(id, context, "NoteTextGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NoteText", NoteTextObjectHelper.toMap(noOpIn, new HashMap(), "NoteText").get("NoteText"));
    }
  }
/**
 *
 * Sets the  NoteText
 * @param noOpInIn NoteTextObjectData to set
 *
 */
  public void setNoteText(NoteTextObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteText passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTextObjectData getNoteText() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteTextObjectHelper.fromMap(inputMap, "NoteText");
  }
}
