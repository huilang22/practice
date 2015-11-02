/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteTemplateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTemplateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTemplateObjectData noOpIn;

/**
 *
 * Constructor to create a   NoteTemplateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTemplateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTemplateObjectData noOpInIn) {
    super(id, context, "NoteTemplateCreate");
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
