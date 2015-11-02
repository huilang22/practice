/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeReasonGetNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a NoteTypeReasonGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTypeReasonGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTypeReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   NoteTypeReasonGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTypeReasonGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeReasonObjectData noOpInIn) {
    super(id, context, "NoteTypeReasonGet");
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
