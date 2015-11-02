/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTemplateUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteTemplateUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTemplateUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTemplateObjectData noOpIn;

/**
 *
 * Constructor to create a   NoteTemplateUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTemplateUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTemplateObjectData noOpInIn) {
    super(id, context, "NoteTemplateUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(noOpIn, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }
/**
 *
 * Sets the  NoteTemplate
 * @param noOpInIn NoteTemplateObjectData to set
 *
 */
  public void setNoteTemplate(NoteTemplateObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteTemplate passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTemplateObjectData getNoteTemplate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteTemplateObjectHelper.fromMap(inputMap, "NoteTemplate");
  }
}
