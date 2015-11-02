/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeObjectKeyData NoteTypeDeleteIn;
/**
 *
 * Constructor to create a  NoteTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeObjectKeyData NoteTypeDeleteInIn) {
    super(id, context, "NoteTypeDelete");
    NoteTypeDeleteIn = NoteTypeDeleteInIn;
  }

  public void translateToMap() {
    if (NoteTypeDeleteIn != null) {
      NoteTypeDeleteIn.resetFlags(true, true);
      addInput("NoteType", NoteTypeObjectKeyHelper.toMap(NoteTypeDeleteIn, new HashMap(), "NoteTypeObjectKeyData").get("NoteTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteType
 * @param NoteTypeDeleteInIn Value of the NoteTypeDeleteIn
 *
 */

  public void setNoteType(NoteTypeObjectKeyData NoteTypeDeleteInIn) {
    NoteTypeDeleteIn = NoteTypeDeleteInIn;
  }

  public void translateFromMap() {
    NoteTypeDeleteIn = NoteTypeObjectKeyHelper.fromMap(inputMap, "NoteType");
  }

/**
 *
 * Gets the NoteType
 * @return Value of the NoteType
 *
 */

  public NoteTypeObjectKeyData getNoteType( ) {
    return NoteTypeDeleteIn;
  }

}
