/*
 * Generated code DO NOT EDIT
 * Generated file: NoteReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a NoteReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteReasonObjectFilter NoteReasonFindIn;
/**
 *
 * Constructor to create a  NoteReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteReasonObjectFilter NoteReasonFindInIn) {
    super(id, context, "NoteReasonFind");
    NoteReasonFindIn = NoteReasonFindInIn;
  }

  public void translateToMap() {
    if (NoteReasonFindIn != null) {
      Integer index =  NoteReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteReason", NoteReasonObjectHelper.toMap(NoteReasonFindIn, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }


/**
 *
 * Sets the NoteReason
 * @param NoteReasonFindInIn Value of the NoteReasonFindIn
 *
 */

  public void setNoteReason(NoteReasonObjectFilter NoteReasonFindInIn) {
    NoteReasonFindIn = NoteReasonFindInIn;
  }

  public void translateFromMap() {
    NoteReasonFindIn = NoteReasonObjectHelper.fromMapFilter(inputMap, "NoteReason");
  }

/**
 *
 * Gets the NoteReason
 * @return Value of the NoteReason
 *
 */

  public NoteReasonObjectFilter getNoteReason( ) {
    return NoteReasonFindIn;
  }

}
