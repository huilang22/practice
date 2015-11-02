/*
 * Generated code DO NOT EDIT
 * Generated file: NoteCreateBulkUdtTemplateItem.java
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
 * Class used to create a NoteCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteObjectData NoteCreateIn;
/**
 *
 * Constructor to create a  NoteCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteObjectData NoteCreateInIn) {
    super(id, context, "NoteCreate");
    NoteCreateIn = NoteCreateInIn;
  }

  public void translateToMap() {
    if (NoteCreateIn != null) {
      NoteCreateIn.resetFlags(true, true);
      addInput("Note", NoteObjectHelper.toMap(NoteCreateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the Note
 * @param NoteCreateInIn Value of the NoteCreateIn
 *
 */

  public void setNote(NoteObjectData NoteCreateInIn) {
    NoteCreateIn = NoteCreateInIn;
  }

  public void translateFromMap() {
    NoteCreateIn = NoteObjectHelper.fromMap(inputMap, "Note");
  }

/**
 *
 * Gets the Note
 * @return Value of the Note
 *
 */

  public NoteObjectData getNote( ) {
    return NoteCreateIn;
  }

}
