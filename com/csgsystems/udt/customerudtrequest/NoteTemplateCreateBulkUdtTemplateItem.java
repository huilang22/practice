/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTemplateCreateBulkUdtTemplateItem.java
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
 * Class used to create a NoteTemplateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTemplateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTemplateObjectData NoteTemplateCreateIn;
/**
 *
 * Constructor to create a  NoteTemplateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTemplateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTemplateObjectData NoteTemplateCreateInIn) {
    super(id, context, "NoteTemplateCreate");
    NoteTemplateCreateIn = NoteTemplateCreateInIn;
  }

  public void translateToMap() {
    if (NoteTemplateCreateIn != null) {
      NoteTemplateCreateIn.resetFlags(true, true);
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(NoteTemplateCreateIn, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }


/**
 *
 * Sets the NoteTemplate
 * @param NoteTemplateCreateInIn Value of the NoteTemplateCreateIn
 *
 */

  public void setNoteTemplate(NoteTemplateObjectData NoteTemplateCreateInIn) {
    NoteTemplateCreateIn = NoteTemplateCreateInIn;
  }

  public void translateFromMap() {
    NoteTemplateCreateIn = NoteTemplateObjectHelper.fromMap(inputMap, "NoteTemplate");
  }

/**
 *
 * Gets the NoteTemplate
 * @return Value of the NoteTemplate
 *
 */

  public NoteTemplateObjectData getNoteTemplate( ) {
    return NoteTemplateCreateIn;
  }

}
