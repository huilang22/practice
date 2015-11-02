/*
 * Generated code DO NOT EDIT
 * Generated file: EnhancedNoteCreateBulkUdtTemplateItem.java
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
 * Class used to create a EnhancedNoteCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EnhancedNoteCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EnhancedNoteObjectData enhancedNoteCreateIn;
/**
 *
 * Constructor to create a  EnhancedNoteCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EnhancedNoteCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, EnhancedNoteObjectData enhancedNoteCreateInIn) {
    super(id, context, "EnhancedNoteCreate");
    enhancedNoteCreateIn = enhancedNoteCreateInIn;
  }

  public void translateToMap() {
    if (enhancedNoteCreateIn != null) {
      enhancedNoteCreateIn.resetFlags(true, true);
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(enhancedNoteCreateIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }


/**
 *
 * Sets the EnhancedNote
 * @param enhancedNoteCreateInIn Value of the enhancedNoteCreateIn
 *
 */

  public void setEnhancedNote(EnhancedNoteObjectData enhancedNoteCreateInIn) {
    enhancedNoteCreateIn = enhancedNoteCreateInIn;
  }

  public void translateFromMap() {
    enhancedNoteCreateIn = EnhancedNoteObjectHelper.fromMap(inputMap, "EnhancedNote");
  }

/**
 *
 * Gets the EnhancedNote
 * @return Value of the EnhancedNote
 *
 */

  public EnhancedNoteObjectData getEnhancedNote( ) {
    return enhancedNoteCreateIn;
  }

}
