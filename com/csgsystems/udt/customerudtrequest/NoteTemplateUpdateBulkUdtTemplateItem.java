/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTemplateUpdateBulkUdtTemplateItem.java
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
 * Class used to create a NoteTemplateUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTemplateUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTemplateObjectData NoteTemplateUpdateIn;
/**
 *
 * Constructor to create a  NoteTemplateUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTemplateUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTemplateObjectData NoteTemplateUpdateInIn) {
    super(id, context, "NoteTemplateUpdate");
    NoteTemplateUpdateIn = NoteTemplateUpdateInIn;
  }

  public void translateToMap() {
    if (NoteTemplateUpdateIn != null) {
      NoteTemplateUpdateIn.resetFlags(true, true);
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(NoteTemplateUpdateIn, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }


/**
 *
 * Sets the NoteTemplate
 * @param NoteTemplateUpdateInIn Value of the NoteTemplateUpdateIn
 *
 */

  public void setNoteTemplate(NoteTemplateObjectData NoteTemplateUpdateInIn) {
    NoteTemplateUpdateIn = NoteTemplateUpdateInIn;
  }

  public void translateFromMap() {
    NoteTemplateUpdateIn = NoteTemplateObjectHelper.fromMap(inputMap, "NoteTemplate");
  }

/**
 *
 * Gets the NoteTemplate
 * @return Value of the NoteTemplate
 *
 */

  public NoteTemplateObjectData getNoteTemplate( ) {
    return NoteTemplateUpdateIn;
  }

}
