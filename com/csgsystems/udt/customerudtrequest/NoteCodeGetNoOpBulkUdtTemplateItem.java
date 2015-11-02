/*
 * Generated code DO NOT EDIT
 * Generated file: NoteCodeGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a NoteCodeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteCodeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   NoteCodeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteCodeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteCodeObjectData noOpInIn) {
    super(id, context, "NoteCodeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NoteCode", NoteCodeObjectHelper.toMap(noOpIn, new HashMap(), "NoteCode").get("NoteCode"));
    }
  }
/**
 *
 * Sets the  NoteCode
 * @param noOpInIn NoteCodeObjectData to set
 *
 */
  public void setNoteCode(NoteCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteCode passed into the constructor
 * @return Simulated response
 *
 */
  public NoteCodeObjectData getNoteCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteCodeObjectHelper.fromMap(inputMap, "NoteCode");
  }
}
