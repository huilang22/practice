/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeObjectKeyData NoteTypeGetIn;
/**
 *
 * Constructor to create a  NoteTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeObjectKeyData NoteTypeGetInIn) {
    super(id, context, "NoteTypeGet");
    NoteTypeGetIn = NoteTypeGetInIn;
  }

  public void translateToMap() {
    if (NoteTypeGetIn != null) {
      NoteTypeGetIn.resetFlags(true, true);
      addInput("NoteType", NoteTypeObjectKeyHelper.toMap(NoteTypeGetIn, new HashMap(), "NoteTypeObjectKeyData").get("NoteTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteType
 * @param NoteTypeGetInIn Value of the NoteTypeGetIn
 *
 */

  public void setNoteType(NoteTypeObjectKeyData NoteTypeGetInIn) {
    NoteTypeGetIn = NoteTypeGetInIn;
  }

  public void translateFromMap() {
    NoteTypeGetIn = NoteTypeObjectKeyHelper.fromMap(inputMap, "NoteType");
  }

/**
 *
 * Gets the NoteType
 * @return Value of the NoteType
 *
 */

  public NoteTypeObjectKeyData getNoteType( ) {
    return NoteTypeGetIn;
  }

}
