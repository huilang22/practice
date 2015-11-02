/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   NoteTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeObjectData noOpInIn) {
    super(id, context, "NoteTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NoteType", NoteTypeObjectHelper.toMap(noOpIn, new HashMap(), "NoteType").get("NoteType"));
    }
  }
/**
 *
 * Sets the  NoteType
 * @param noOpInIn NoteTypeObjectData to set
 *
 */
  public void setNoteType(NoteTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteType passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTypeObjectData getNoteType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteTypeObjectHelper.fromMap(inputMap, "NoteType");
  }
}
