/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeReasonObjectFilter NoteTypeReasonFindIn;
/**
 *
 * Constructor to create a  NoteTypeReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeReasonObjectFilter NoteTypeReasonFindInIn) {
    super(id, context, "NoteTypeReasonFind");
    NoteTypeReasonFindIn = NoteTypeReasonFindInIn;
  }

  public void translateToMap() {
    if (NoteTypeReasonFindIn != null) {
      Integer index =  NoteTypeReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(NoteTypeReasonFindIn, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }


/**
 *
 * Sets the NoteTypeReason
 * @param NoteTypeReasonFindInIn Value of the NoteTypeReasonFindIn
 *
 */

  public void setNoteTypeReason(NoteTypeReasonObjectFilter NoteTypeReasonFindInIn) {
    NoteTypeReasonFindIn = NoteTypeReasonFindInIn;
  }

  public void translateFromMap() {
    NoteTypeReasonFindIn = NoteTypeReasonObjectHelper.fromMapFilter(inputMap, "NoteTypeReason");
  }

/**
 *
 * Gets the NoteTypeReason
 * @return Value of the NoteTypeReason
 *
 */

  public NoteTypeReasonObjectFilter getNoteTypeReason( ) {
    return NoteTypeReasonFindIn;
  }

}
