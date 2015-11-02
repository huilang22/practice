/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeReasonObjectKeyData NoteTypeReasonGetIn;
/**
 *
 * Constructor to create a  NoteTypeReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeReasonObjectKeyData NoteTypeReasonGetInIn) {
    super(id, context, "NoteTypeReasonGet");
    NoteTypeReasonGetIn = NoteTypeReasonGetInIn;
  }

  public void translateToMap() {
    if (NoteTypeReasonGetIn != null) {
      NoteTypeReasonGetIn.resetFlags(true, true);
      addInput("NoteTypeReason", NoteTypeReasonObjectKeyHelper.toMap(NoteTypeReasonGetIn, new HashMap(), "NoteTypeReasonObjectKeyData").get("NoteTypeReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteTypeReason
 * @param NoteTypeReasonGetInIn Value of the NoteTypeReasonGetIn
 *
 */

  public void setNoteTypeReason(NoteTypeReasonObjectKeyData NoteTypeReasonGetInIn) {
    NoteTypeReasonGetIn = NoteTypeReasonGetInIn;
  }

  public void translateFromMap() {
    NoteTypeReasonGetIn = NoteTypeReasonObjectKeyHelper.fromMap(inputMap, "NoteTypeReason");
  }

/**
 *
 * Gets the NoteTypeReason
 * @return Value of the NoteTypeReason
 *
 */

  public NoteTypeReasonObjectKeyData getNoteTypeReason( ) {
    return NoteTypeReasonGetIn;
  }

}
