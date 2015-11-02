/*
 * Generated code DO NOT EDIT
 * Generated file: NoteCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a NoteCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteCodeObjectKeyData NoteCodeGetIn;
/**
 *
 * Constructor to create a  NoteCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteCodeObjectKeyData NoteCodeGetInIn) {
    super(id, context, "NoteCodeGet");
    NoteCodeGetIn = NoteCodeGetInIn;
  }

  public void translateToMap() {
    if (NoteCodeGetIn != null) {
      NoteCodeGetIn.resetFlags(true, true);
      addInput("NoteCode", NoteCodeObjectKeyHelper.toMap(NoteCodeGetIn, new HashMap(), "NoteCodeObjectKeyData").get("NoteCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteCode
 * @param NoteCodeGetInIn Value of the NoteCodeGetIn
 *
 */

  public void setNoteCode(NoteCodeObjectKeyData NoteCodeGetInIn) {
    NoteCodeGetIn = NoteCodeGetInIn;
  }

  public void translateFromMap() {
    NoteCodeGetIn = NoteCodeObjectKeyHelper.fromMap(inputMap, "NoteCode");
  }

/**
 *
 * Gets the NoteCode
 * @return Value of the NoteCode
 *
 */

  public NoteCodeObjectKeyData getNoteCode( ) {
    return NoteCodeGetIn;
  }

}
