/*
 * Generated code DO NOT EDIT
 * Generated file: EnhancedNoteUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EnhancedNoteUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EnhancedNoteUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EnhancedNoteObjectData noOpIn;

/**
 *
 * Constructor to create a   EnhancedNoteUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EnhancedNoteUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EnhancedNoteObjectData noOpInIn) {
    super(id, context, "EnhancedNoteUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(noOpIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
/**
 *
 * Sets the  EnhancedNote
 * @param noOpInIn EnhancedNoteObjectData to set
 *
 */
  public void setEnhancedNote(EnhancedNoteObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EnhancedNote passed into the constructor
 * @return Simulated response
 *
 */
  public EnhancedNoteObjectData getEnhancedNote() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EnhancedNoteObjectHelper.fromMap(inputMap, "EnhancedNote");
  }
}
